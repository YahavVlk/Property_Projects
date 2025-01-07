public abstract class Property {

    // Instance variables
    private String address;
    private int area;
    private int price;

    public Property() {
        this.address = "Na, na";
        this.area = 0;
        this.price = 0;
    }

    public Property(String address, int area, int price) {
        setAddress(address);
        setArea(area);
        setPrice(price);
    }

    // Getter for address
    public String getAddress() {
        return address;
    }

    // Setter for address with validation
    public void setAddress(String address) {
        if (address == null || address.trim().isEmpty()) {
            throw new IllegalArgumentException("Address cannot be null or empty.");
        }

        String[] words = address.trim().split("\\s+");
        if (words.length < 2) {
            throw new IllegalArgumentException("Address must contain at least two words.");
        }

        this.address = address;
    }

    // Getter for area
    public int getArea() {
        return area;
    }

    // Setter for area with validation
    public void setArea(int area) {
        if (area < 0) {
            throw new IllegalArgumentException("Area cannot be negative.");
        }
        this.area = area;
    }

    // Getter for price
    public int getPrice() {
        return price;
    }

    // Setter for price with validation
    public void setPrice(int price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative.");
        }
        this.price = price;
    }

    // toString method
    @Override
    public String toString() {
        return "Address: " + address + ", Area: " + area + " sq. meters, Price: " + price + " units";
    }

    public abstract double taxIt();
}
