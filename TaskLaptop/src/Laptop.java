class Laptop {
    private String brand;
    private double price;
    private int ram;
    private String processor;

    public Laptop(String brand, double price, int ram, String processor) {
        this.brand = brand;
        this.price = price;
        this.ram = ram;
        this.processor = processor;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public int getRam() {
        return ram;
    }

    public String getProcessor() {
        return processor;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", ram=" + ram +
                ", processor='" + processor + '\'' +
                '}';
    }
}