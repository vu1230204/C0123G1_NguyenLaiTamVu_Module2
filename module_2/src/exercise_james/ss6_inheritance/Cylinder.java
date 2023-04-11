package exercise_james.ss6_inheritance;

public class Cylinder extends Circle{
    //lớp Cylinder kế thừa từ lớp Circle
    private double height;

    //overloading
    public Cylinder() {
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color); // kế thừa từ lớp cha Circle
        this.height = height; // height được thêm mới từ lớp con Cylinder
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * this.height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", which is a subclass of " + super.toString();
    }
}
