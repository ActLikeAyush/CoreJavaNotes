import java.util.*;
class LoopingDoWhile{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=0;
        do{
            if(a==0){
                System.out.println("condition is not check");
            }
            else{
                System.out.println("condition is checked");
                System.out.println("statement is runging");
            }
            a++;
        }
        while(a<=10);

        // sum of 10
        int sum=0;
        int i=0;
        System.out.println("input: ");
        int n=sc.nextInt();
        do{
            sum=sum+i;
            i++;
            System.out.println("output: "+sum);
        }
        while(i<=n);
        System.out.println("total sum is: "+sum);
        
    }
}