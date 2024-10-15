class Laptop {
    private String brand;
    private double price;
    private int ram;
    private String processor;
    private int hdd;

    public Laptop(String brand, double price, int ram, String processor, int hdd) {
        this.brand = brand;
        this.price = price;
        this.ram = ram;
        this.processor = processor;
        this.hdd = hdd;
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

    public int getHdd() {
        return hdd;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", ram=" + ram + " GB" +
                ", processor='" + processor + '\'' +
                ", hdd='" + hdd + " GB " + '\'' +
                '}';
    }
}