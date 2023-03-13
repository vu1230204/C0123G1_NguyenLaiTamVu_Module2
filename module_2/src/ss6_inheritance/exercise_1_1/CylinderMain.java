package ss6_inheritance.exercise_1_1;

public class CylinderMain {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.setHeight(5);
        cylinder.setRadius(1);
        cylinder.setColor("red");
        System.out.println("volume=" + cylinder.toString());
        System.out.println(cylinder.getVolume());
    }
}
