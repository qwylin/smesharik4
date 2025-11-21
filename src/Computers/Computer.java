package Computer;

public class computer {
    private Processor processor;
    private Memory memory;
    private Monitor monitor;
    private Brand computerBrand;

    public Computer(Brand computerBrand, Processor processor, Memory memory, Monitor monitor) {
        this.computerBrand = computerBrand;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    public Processor getProcessor() { return processor; }
    public Memory getMemory() { return memory; }
    public Monitor getMonitor() { return monitor; }
    public Brand getComputerBrand() { return computerBrand; }
}
    @Override
    public String toString() {
        return "Компьютер " + computerBrand + ":\n" +
                "Процессор: " + processor + "\n" +
                "Память: " + memory + "\n" +
                "Монитор: " + monitor;
    }
