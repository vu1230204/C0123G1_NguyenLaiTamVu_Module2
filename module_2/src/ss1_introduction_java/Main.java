import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int Width;
        int Length;

        Scanner inputWidth = new Scanner(System.in);
        System.out.println("Mời bạn nhập chiều rộng ");
        Width = inputWidth.nextInt();

        Scanner inputLength = new Scanner(System.in);
        System.out.println("Mời bạn nhập chiều dài");
        Length = inputLength.nextInt();

        for (int i = 1; i <= Length; i++) {
            for (int j = 1; j <= Width; j++) {

                System.out.println("*");

            }
        }
        System.out.println(" ");
    }

}
