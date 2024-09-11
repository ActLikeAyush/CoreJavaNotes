import java.util.Arrays;
class ArrayCopyOfRange{
    public static void main(String args[]){
        int []arr={10,20,30,40};
        int []arr1={50,60};
        arr1=Arrays.copyOfRange(arr,0,4);
        System.out.println(Arrays.toString(arr1));
        //it remove all the original 
        // System.out.println(Arrays.toString(Arrays.copyOfRange(arr,1,7)));
    }
}