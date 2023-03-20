package ss11_stack.exercise_1_1;

        import java.util.Arrays;
        import java.util.Stack;

public class RevertString {
    public static void main(String[] args) {
        String[] string = {"Nguyễn ", "Lại", "Vũ"};
        Stack<String> wStack = new Stack<>();
        System.out.println(Arrays.toString(string));

        for (int i = 0; i < string.length; i++) {
            wStack.push(string[i]);
        }
        System.out.println(wStack);
        for (int i = 0; i < string.length; i++) {
            string[i] = wStack.pop();
        }
        System.out.println(Arrays.toString(string));
    }
}
