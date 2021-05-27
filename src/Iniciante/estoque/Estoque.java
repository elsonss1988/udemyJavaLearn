package Iniciante.estoque;

public class Estoque {
    private String name;
    private Double price;
    private Integer quantity;

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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Estoque(){};

    public Estoque(String name, Double price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Double totalValueInStock(){
        return getPrice()*getQuantity();
    }
    public void addProducts(Integer quantity){
        setQuantity(getQuantity()+1);
    }
    public void removeProducts(Integer quantity){
        setQuantity(getQuantity()-1);
    }

    @Override
    public String toString() {
        return "Estoque " +
                "name='" + name + '\'' +
                ", price=" + String.format("%.2f",price) +
                ", quantity=" +String.format("%.2f", totalValueInStock()) +
                ' ';
    }
}
