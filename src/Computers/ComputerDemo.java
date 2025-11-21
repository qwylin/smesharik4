package Computers;

public class ComputerDemo {
    public static void main(String[] args) {
        Processor processor = new Processor(Brand.INTEL, "Core i7", 3.5);
        Memory memory = new Memory(Brand.SAMSUNG, 16, "DDR4");
        Monitor monitor = new Monitor(Brand.DELL, 24.0, "1920x1080");

        computer computer = new Computer(Brand.ASUS, processor, memory, monitor);

        System.out.println(computer);
    }
}
