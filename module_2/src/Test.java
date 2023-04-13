public class Test {
    public static void main(String[] args) {
        int i = 0;
        boolean flag;
        do {
            flag = false;
            System.out.println(++i);
            flag = i < 10;
            continue;
        } while ((flag) ? true : false);
    }
}
