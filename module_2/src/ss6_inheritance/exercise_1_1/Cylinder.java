package ss6_inheritance.exercise_1_1;

public class Cylinder extends Circle {
    protected double height;

    public Cylinder() {
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public double getVolume() {
        return Math.PI * Math.pow(super.getRadius(), 2) * this.height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", volume=" + getVolume() +
                '}';
    }
}
