// Plot class
public class Plot extends Property {

    // Enum for plot type
    public enum Type {
        URBAN, AGRICULTURAL, INDUSTRIAL
    }
    // Instance variable
    private Type plotType;

    // Constructor
    public Plot(String address, int area, int price, Type plotType) {
        super(address, area, price); // Call to superclass constructor
        setPlotType(plotType);
    }

    // Getter and Setter for plotType
    public Type getPlotType() {
        return plotType;
    }

    public void setPlotType(Type plotType) {
        if (plotType == null) {
            throw new IllegalArgumentException("Plot type cannot be null.");
        }
        this.plotType = plotType;
    }

    @Override
    public String toString() {
        return super.toString() + ", Plot Type: " + plotType;
    }

    @Override
    public double taxIt() {
        double taxRate;
        switch (plotType) {
            case URBAN:
                taxRate = 0.10;
                break;
            case INDUSTRIAL:
                taxRate = 0.05;
                break;
            case AGRICULTURAL:
                taxRate = 0.02;
                break;
            default:
                throw new IllegalArgumentException("Unknown plot type.");
        }
        return getPrice() * taxRate;
    }
}
