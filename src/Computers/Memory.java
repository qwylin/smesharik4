package Computer;

public class Memory {
    private Brand brand;
    private int size; // в GB
    private String type;

    public Memory(Brand brand, int size, String type) {
        this.brand = brand;
        this.size = size;
        this.type = type;
    }

    public Brand getBrand() { return brand; }
    public int getSize() { return size; }
    public String getType() { return type; }

    @Override
    public String toString() {
        return brand + " " + size + "GB " + type;
    }
}