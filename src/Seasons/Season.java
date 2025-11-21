public enum Season {
    WINTER(-5.0, "Холодное время года"),
    SPRING(10.0, "Холодное время года"),
    SUMMER(25.0, "Теплое время года"),
    AUTUMN(8.0, "Холодное время года");

    private final double averageTemperature;
    private final String description;

    Season(double averageTemperature, String description) {
        this.averageTemperature = averageTemperature;
        this.description = description;
    }

    public double getAverageTemperature() {
        return averageTemperature;
    }

    public String getDescription() {
        return description;
    }
}