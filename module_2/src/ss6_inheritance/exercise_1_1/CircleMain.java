package ss6_inheritance.exercise_1_1;

public class CircleMain {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(1);
        circle.setColor("blue");
        System.out.println(circle.toString());
        System.out.println(circle.getRadius());
    }
}
