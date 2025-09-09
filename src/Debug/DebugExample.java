package Debug;

public class DebugExample {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        int result = a / b; // crash: divide by zero
        System.out.println(result);
    }
}
