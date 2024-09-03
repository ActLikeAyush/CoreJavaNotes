// write a java program to print 1 to 10 using arrays 
import java.util.*;
class Array1{
    public static void main(String args[]){
        System.out.println("Enter The Size of Array");
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        int[] arr=new int[b];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}