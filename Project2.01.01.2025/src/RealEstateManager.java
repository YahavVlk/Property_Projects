import java.util.ArrayList;

public class RealEstateManager{
    private String name;
    private ArrayList<Property> properties;

    public RealEstateManager(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Property> getProperties() {
        return properties;
    }

    public void setProperties(ArrayList<Property> properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "RealEstateManager{" +
                "name='" + name + '\'' +
                ", properties=" + properties +
                '}';
    }

    public void addProperty(Property property){
        properties.add(property);
    }

    public ArrayList<Property> untilPrice(int price){
        ArrayList<Property> lowerPrices = new ArrayList<>();
        for (Property property : properties) {
            if(property.getPrice() <= price)
                lowerPrices.add(property);
        }
        return  lowerPrices;
    }

    public int sumPrices(){
        int sum = 0;
        for (Property property : properties) {
            sum += property.getPrice();
        }
        return sum;
    }
}
