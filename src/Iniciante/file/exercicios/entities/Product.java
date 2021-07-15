package Iniciante.file.exercicios.entities;

public class Product {
    private String name;
    private double price;
    private int quantify;

    public Product(){};

    public Product(String name, double price, int quantify) {
        this.name = name;
        this.price = price;
        this.quantify = quantify;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantify() {
        return quantify;
    }

    public void setQuantify(int quantify) {
        this.quantify = quantify;
    }

    public double subtotal(){
        return quantify*price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append("name='").append(name).append('\'');
        sb.append("subtotal=").append(this.subtotal());
        return sb.toString();
    }
}
