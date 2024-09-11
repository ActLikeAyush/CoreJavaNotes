import java.util.Arrays;

class ArraysCopyOf {
    public static void main(String args[]) {
        int arr[] = {10, 20, 30, 40};
        int newArr[] = Arrays.copyOf(arr, 10);
        System.out.println(Arrays.toString(newArr));
    }
}