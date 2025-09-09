package Debug;

public class DebugDemo {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 0, 20};
        int result = calculate(numbers);
        System.out.println("Final result: " + result);
    }

    static int calculate(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += 100 / arr[i];   // ⚠️ potential divide by zero
        }
        return sum;
    }
}
