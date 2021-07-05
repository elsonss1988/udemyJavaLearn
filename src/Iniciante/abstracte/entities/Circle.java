package Iniciante.abstracte.entities;

public class Circle extends Shape{
    private Double radius;

    public Circle(Color color,Double radius) {
        super(color);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public double Area() {
        return Math.PI * radius * radius;
    }
}
