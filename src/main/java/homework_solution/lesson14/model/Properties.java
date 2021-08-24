package homework_solution.lesson14.model;

import java.util.Objects;

public class Properties {
    private String type;
    private String address;
    private double price;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Properties that = (Properties) o;
        return Double.compare(that.price, price) == 0 &&
                Objects.equals(type, that.type) &&
                Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, address, price);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Properties(String type, String address, double price) {
        this.type = type;
        this.address = address;
        this.price = price;
    }
}
