public class Villa extends Residential {

    private int levels;

    public Villa(String address, int area, int price, int parkingLots, int levels) {
        super(address, area, price, parkingLots);
        setLevels(levels);
    }

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        if (levels < 1) {
            throw new IllegalArgumentException("Levels must be greater than or equal to 1.");
        }
        this.levels = levels;
    }

    @Override
    public String toString() {
        return super.toString() + ", Levels: " + levels;
    }

    @Override
    public double taxIt() {
        return getPrice() * 0.08; // 8% tax for villas
    }
}
