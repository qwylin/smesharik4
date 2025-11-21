package Computer;

public class Processor {
    private Brand brand;
    private String model;
    private double frequency;

    public Processor(Brand brand, String model, double frequency) {
        this.brand = brand;
        this.model = model;
        this.frequency = frequency;
    }

    public Brand getBrand() { return brand; }
    public String getModel() { return model; }
    public double getFrequency() { return frequency; }

    @Override
    public String toString() {
        return brand + " " + model + " " + frequency + "GHz";
    }
}