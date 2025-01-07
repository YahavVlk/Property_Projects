public abstract class Residential extends Property {

    private int parkingLots;

    public Residential(String address, int area, int price, int parkingLots) {
        super(address, area, price);
        setParkingLots(parkingLots);
    }

    public int getParkingLots() {
        return parkingLots;
    }

    public void setParkingLots(int parkingLots) {
        if (parkingLots < 0) {
            throw new IllegalArgumentException("Parking lots cannot be negative.");
        }
        this.parkingLots = parkingLots;
    }

    @Override
    public String toString() {
        return super.toString() + ", Parking Lots: " + parkingLots;
    }
}
