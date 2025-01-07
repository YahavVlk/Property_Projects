public class Vacation extends Residential {

    private int guests;

    public Vacation(String address, int area, int price, int parkingLots, int guests) {
        super(address, area, price, parkingLots);
        setGuests(guests);
    }

    public int getGuests() {
        return guests;
    }

    public void setGuests(int guests) {
        if (guests < 1) {
            throw new IllegalArgumentException("Guests must be greater than or equal to 1.");
        }
        this.guests = guests;
    }

    @Override
    public String toString() {
        return super.toString() + ", Guests: " + guests;
    }

    @Override
    public double taxIt() {
        return getPrice() * 0.25; // 25% tax for vacation apartments
    }

}
