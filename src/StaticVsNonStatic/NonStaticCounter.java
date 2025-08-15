package StaticVsNonStatic;

public class NonStaticCounter {
    int value = 0;

    void increment(){
        value++;
    }

    public static void main(String[] args) {
        NonStaticCounter c1 = new NonStaticCounter();
        c1.increment();
        c1.increment();
        System.out.println(c1.value);
    }
}

