import java.util.Arrays;
class ArraysEqual{
    public static void main(String args[]){
        int arr1[]={10,20};
        int arr2[]={10,20};
        int arr3[]={20,10};
        System.out.println(Arrays.equals(arr1,arr2));
        System.out.println(Arrays.equals(arr1,arr3));
    }
}