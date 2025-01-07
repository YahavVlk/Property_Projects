public class Office extends Property{

    public Office() {
    }

    public Office(String address, int area, int price) {
        super(address, area, price);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double taxIt() {
        return getPrice() * 0.05; // Tax rate for Office properties
    }
}
