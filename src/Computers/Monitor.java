package Computer;

public class Monitor {
    private Brand brand;
    private double size; // в дюймах
    private String resolution;

    public Monitor(Brand brand, double size, String resolution) {
        this.brand = brand;
        this.size = size;
        this.resolution = resolution;
    }

    public Brand getBrand() { return brand; }
    public double getSize() { return size; }
    public String getResolution() { return resolution; }

    @Override
    public String toString() {
        return brand + " " + size + "\" " + resolution;
    }
}
