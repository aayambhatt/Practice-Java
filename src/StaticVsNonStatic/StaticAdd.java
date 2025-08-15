package StaticVsNonStatic;

public class StaticAdd {
    static int add(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        int result = StaticAdd.add(4, 5);
        System.out.println(result);
    }
}