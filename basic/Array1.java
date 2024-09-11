// write a java program to print 1 to 10 using arrays 
import java.util.*;
class Array1{
    public static void main(String args[]){
        System.out.println("Enter The Size of Array");
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        int[] arr=new int[b];
        
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the element ");
            arr[i]=sc.nextInt();
        }
        
        System.out.println("Print uisng toSting() ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Print uisng forEach ");

        for(int j:arr){
            System.out.println(j);
        }


        //sum of arrays element 
        int sum=0;
        for(int k=0;k<arr.length;k++){
            sum += arr[k];
        }
        System.out.println("sum of array is "+sum);

        //write a java program  to print sum of positive number of the array
        int Sum=0;
        for(int c:arr){
            if(c>0){
                Sum+=c;
            }   
        }
        System.out.println("Sum of Positive number is: "+Sum);

        // write java program to print output in the form of matrix

        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr.length;col++){
                
            }
        }
    }
}