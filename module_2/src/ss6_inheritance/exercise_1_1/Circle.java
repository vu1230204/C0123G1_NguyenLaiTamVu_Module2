package ss6_inheritance.exercise_1_1;

public class Circle {
    double radius;
    String color;

    protected Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    protected double getRadius() {
        return radius;
    }

    protected void setRadius(double radius) {
        this.radius = radius;
    }

    protected String getColor() {
        return color;
    }

    protected void setColor(String color) {
        this.color = color;
    }

    public double getArea(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}


