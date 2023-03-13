package ss6_inheritance.exercise_3_1;

public class MovablePointMain {
    public static void main(String[] args) {
        MovablePoint moveablePoint = new MovablePoint(4,5);
        moveablePoint.setX(5);
        moveablePoint.setY(4);
        moveablePoint.setxSpeed(2);
        moveablePoint.setySpeed(2);
        System.out.println(moveablePoint.getxSpeed());
        System.out.println(moveablePoint.getSpeed());
        System.out.println(moveablePoint.toString());
        moveablePoint.move();
        System.out.println(moveablePoint.getXY());
    }
}
