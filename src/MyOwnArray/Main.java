package MyOwnArray;

class AayamArray {
    private int[] data;   // underlying storage
    private int length;   // number of elements currently in use

    // Constructor: allocate storage
    public AayamArray(int size) {
        data = new int[size];
        length = size;
    }

    // Get length
    public int length() {
        return length;
    }

    // Get element at index
    public int get(int index) {
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException();
        }
        return data[index];
    }

    // Set element at index
    public void set(int index, int value) {
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException();
        }
        data[index] = value;
    }
}



public class Main {
    public static void main(String[] args) {
        AayamArray arr = new AayamArray(5);

        arr.set(0, 10);
        arr.set(1, 20);

        System.out.println("Length: " + arr.length());
        System.out.println("arr[0] = " + arr.get(0));
        System.out.println("arr[1] = " + arr.get(1));
    }
}
