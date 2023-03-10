package ss5_access_java.exercise_1_1;

public class Circle {

    double radius = 1.0;
    String color = "Red";

    public Circle() {
    }

    public Circle(double r) {
        this.radius = r;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

}

