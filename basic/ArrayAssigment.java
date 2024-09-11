import java.util.*;
class ArrayAssigment{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter the size of array");
        // int size=sc.nextInt();
        // int arr[]=new int[size];
        // for(int i=0;i<arr.length;i++){
        //     arr[i]=sc.nextInt();
        // }
        int arr[]={55, 77, 22, 19, 56};
        System.out.println("given array is");
        System.out.println(Arrays.toString(arr));

        //find the smallest number in the array
        int min=arr[0];
        for(int num:arr){
            if(min>num){
                min=num;
            }
        }
        System.out.println("smallest number in the array: "+min);

        //find the largest number in the array
        int max=0;
        for(int num:arr){
            if(max<num){
                max=num;
            }
        }
        System.out.println("largest number in the array: "+max);

        // fint the second smallest and second largest number in the array 
        Arrays.sort(arr);

        System.out.println("Second smallest number is: "+arr[2]+"\n"+"second largest number is: "+arr[(arr.length)-2]);

        // Reverse the given array 
        for(int i=(arr.length)-1;i>=0;i--){
            System.out.println(arr[i]);
        }

        
    }
}