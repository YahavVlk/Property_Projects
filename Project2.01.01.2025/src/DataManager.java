import java.util.ArrayList;

public class DataManager {
    public static ArrayList<Property> buildArray() {
        ArrayList<Property> properties = new ArrayList<>();

        // Plots
        Plot plotOne = new Plot("Achad Ha'am 9", 120, 4_000_000, Plot.Type.URBAN);
        properties.add(plotOne);
        Plot plotTwo = new Plot("HaPalmach 70", 200, 5_500_000, Plot.Type.INDUSTRIAL);
        properties.add(plotTwo);

        // Apartments
        Apartment apartmentOne = new Apartment("Herzl 17", 220, 4_800_000, 2, 5);
        properties.add(apartmentOne);
        Apartment apartmentTwo = new Apartment("Ahuzat Hanasi 5", 140, 3_300_000, 4, 3);
        properties.add(apartmentTwo);

        // Villas
        Villa villaOne = new Villa("Rothschild 38", 100, 6_000_000, 1, 2);
        properties.add(villaOne);
        Villa villaTwo = new Villa("HaTsivoni 12", 210, 8_800_000, 2, 3);
        properties.add(villaTwo);

        // Vacation Properties
        Vacation vacationOne = new Vacation("Hanasi 8", 300, 10_000_000, 5, 8);
        properties.add(vacationOne);
        Vacation vacationTwo = new Vacation("HaPalmach 36", 270, 8_000_000, 2, 4);
        properties.add(vacationTwo);

        // Offices
        Office officeOne = new Office("HaPalmach 20", 120, 3_500_000);
        properties.add(officeOne);
        Office officeTwo = new Office("Yehuda Halevi 15", 200, 4_800_000);
        properties.add(officeTwo);

        // Commercial Properties
        Commercial commercialOne = new Commercial("Bar Ilan 10", 150, 6_000_000, false, 7.5);
        properties.add(commercialOne);
        Commercial commercialTwo = new Commercial("Hagiborim 25", 250, 9_000_000, true, 6.0);
        properties.add(commercialTwo);

        return properties;
    }
}
