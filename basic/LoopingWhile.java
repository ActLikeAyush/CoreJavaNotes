import java.util.Scanner;
class LoopingWhile{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any num");
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            System.out.println(i+".");
            i++;
            
        }
        // write a java program to find the sum of 10 number 
        int sum=0;
        int j=0;
        while (j<=n){
            sum=sum+j;
            j++;
        }
        System.out.println("sum of "+n+" number is: "+sum);
    }
}