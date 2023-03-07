package ss2_loop_array_java.exercise_2_3;

public class IsPrimeLess100 {
    public static void main(String[] args) {
        System.out.println("Số nguyên tố nhỏ hơn 100");
        int number = 2;
        while (number < 100) {
            int count = 0;
            for (int i = 1; i <= number; i++) {

                if (number % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(number);

            }
            number++;


        }
    }
}
