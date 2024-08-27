import java.util.Scanner;
class LoopingWhile{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any num");
        int n=sc.nextInt();
        int i=0;
        while(i<=n){
            System.out.println(i+".  Welcome");
            i++;
            
        }
    }
}