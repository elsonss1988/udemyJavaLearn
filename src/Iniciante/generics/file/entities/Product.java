package Iniciante.generics.file.entities;

public class Product {
    private String name;
    private Double price;

    public Product(){}

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Product");
        sb.append("name='").append(name).append('\'');
        sb.append(", price=").append(String.format("%.2f",price));
        return sb.toString();
    }
}
