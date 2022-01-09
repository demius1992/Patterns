package creational.prototype;

class Car extends Device {
    // car's properties
    private String brand;
    private String model;
    private String color;
    private int year;

    // constructors
    public Car() {
        this("No information", "No model", "No color", 0);
    }

    Car(String brand, String model, String color, int year) {
        SetName("Car");

        setBrand(brand);
        setModel(model);
        setColor(color);
        setYear(year);

    }

    // realization of an abstract method in a descendant
    public Device CloneIt() {
        Car c = new Car(this.getBrand(), this.getModel(), this.getColor(), this.getYear());
        return c;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }

    // additional methods


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}


