public class Commercial extends Property{
    private boolean storeRoom = false;
    private double yield = 0.0;

    public Commercial(String address, int area, int price, boolean storeRoom) {
        super(address, area, price);
        this.storeRoom = false;
    }

    public Commercial(String address, int area, int price, boolean storeRoom, double yield) {
        super(address, area, price);
        this.storeRoom = storeRoom;
        this.yield = yield;
    }

    public boolean isStoreRoom() {
        return storeRoom;
    }

    public void setStoreRoom(boolean storeRoom) {
        this.storeRoom = storeRoom;
    }

    public double getYield() {
        return yield;
    }

    public void setYield(double yield) {
        if (yield < 0.0) {
            throw new IllegalArgumentException("Apartments must be positive.");
        }
        this.yield = yield;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Commercial{" +
                "storeRoom=" + storeRoom +
                ", yield=" + yield +
                '}';
    }

    public double predictedYield(){
        return getPrice() * (yield / 100) / 12;
    }

    @Override
    public double taxIt() {
        return getPrice() * 0.05; // Tax rate for Commercial properties
    }
}
