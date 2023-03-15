package ss7_abstraction.exercise_1_1;

public class Square implements iResize {
    private double side;

    public Square() {

    }

    public Square(double side) {
        this.side = side;
    }


    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public void setResize(double percent) {
        this.side = this.side + (this.side * percent);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
