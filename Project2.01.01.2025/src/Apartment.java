public class Apartment extends Residential {

    private int rooms;

    public Apartment(String address, int area, int price, int parkingLots, int rooms) {
        super(address, area, price, parkingLots);
        setRooms(rooms);
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        if (rooms < 1) {
            throw new IllegalArgumentException("Rooms must be greater than or equal to 1.");
        }
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return super.toString() + ", Rooms: " + rooms;
    }

    @Override
    public double taxIt() {
        return getPrice() * 0.08; // 8% tax for apartments
    }
}
