import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    static ArrayList<Property>  properties =  new ArrayList<>();

    public static void main(String[] args) {
        properties = DataManager.buildArray();
        System.out.println("Please Enter Number:\n" +
                "1. Search properties\n" +
                "2. Financial Report\n" +
                "3. Commercial Yield\n" +
                "4. Properties By City\n" +
                "5. Number Of Cities\n" +
                "6. Exit\n");
        StartMenu();
    }

    public static void StartMenu() {
        Scanner input = new Scanner(System.in);
        int selection = input.nextInt();
        if(selection == 6)
            System.out.println("Exiting...");
        else{
            switch (selection) {
                case 1:
                    try {
                        propertySearch();
                    } catch (PriceException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 2:
                    financialReport();
                    break;
                case 3:
                    commercialYield();
                    break;
                case 4:
                    propertiesByCity();
                    break;
                case 5:
                    numOfCities();
                    break;
                default:
                    System.out.println("Please enter a number in the given range");
                    StartMenu();
            }
        }
    }

    private static void numOfCities() {
        ArrayList<String> cities = new ArrayList<>();
        for (Property property : properties) {
            cities.add(property.getAddress().toLowerCase()
                    .replace("-", " ").replaceAll("[0-9]", "").trim());
        }
        HashSet<String> uniqueCities = new HashSet<>();
        for (String city : cities) {
            uniqueCities.add((city));
        }
        System.out.println("Number of Cities: " + uniqueCities.size());
        StartMenu();
    }

    private static void propertiesByCity() {
        Scanner input = new Scanner(System.in);
        int cnt = 0;
        System.out.println("Enter City Name:");
        String cityName = input.nextLine();
        cityName = cityName.toLowerCase()
                .replace("-"," ").replaceAll("[0-9]","").trim();
        for (Property property : properties) {
            if(property.getAddress().toLowerCase()
                    .replace("-"," ").replaceAll("[0-9]","").trim().equals(cityName)) {
                System.out.println(property.toString());
                cnt++;
            }
        }
        if(cnt == 0){
            System.out.println("No Existing Results");
        }
        StartMenu();
    }

    private static void commercialYield() {
        double sum = 0.0;
        for (Property property : properties) {
            if(property instanceof Commercial)
                sum += ((Commercial) property).getYield();
        }
        System.out.println("Sum Of Commercial Yield: " + sum);
        StartMenu();
    }

    private static void financialReport() {
        System.out.println("Financial Report:");
        for (Property property : properties) {
            System.out.println(property.getAddress() + " -> " + property.taxIt());
        }
        StartMenu();
    }

    public static class PriceException extends Exception {
        public PriceException(String message) {
            super(message);
        }
    }

    private static void propertySearch() throws PriceException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Price:");
        int price = input.nextInt(), cnt = 0;
        if(price < 0)
            throw new PriceException("Price cant be negative");
        ArrayList<Property> lowerPrices = new ArrayList<>();
        for (Property property : properties) {
            if(property.getPrice() <= price) {
                cnt++;
                lowerPrices.add(property);
            }
        }
        if(cnt == 0)
            System.out.println("No Available Results");
        for (Property lowerPrice : lowerPrices) {
            System.out.println(lowerPrice.toString());
        }
        StartMenu();
    }
}