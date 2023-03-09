package ss4_class_oop.exercise_1;

import java.util.Scanner;

public class QuadraticEquation {
    double a;
    double b;
    double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    double getDiscriminant() {

        return Math.pow(this.b, 2) - 4 * this.a * this.c;

    }

    double getRoot1() {
        return (-1 * this.b + Math.sqrt(getDiscriminant())) / 2 * a;
    }

    double getRoot2() {
        return (-1 * this.b - Math.sqrt(getDiscriminant())) / 2 * a;
    }


    public String toString() {
        return "QuadracticEquation{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}

