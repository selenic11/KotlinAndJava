public class ProgramJ {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
        System.out.println(max(-5, 7));
    }

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        }
        else {
            return b;
        }
    }
}
