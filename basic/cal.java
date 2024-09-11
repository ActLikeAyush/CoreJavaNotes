import java.util.Scanner;
class cal{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number: ");
        int a=sc.nextInt();
        System.out.println("Enter any number: ");
        int b=sc.nextInt();
        System.out.println("Enter your Choise: +,-,*,/ ");
        char op=sc.next().charAt(0);
        
        if(op=='+')
        {
            a=a+b;
            System.out.println("your output is: "+a);
        }
        else if(op=='-')
        {
            a=a-b;
            System.out.println("your output is: "+a);
        }
        else if(op=='*'){
            a=a*b;
            System.out.println("your output is: "+a);
        }
        else if(op=='/'){
            a=a/b;
            System.out.println("your output is: "+a);
        }
        else{
            System.out.println("try again");
        }
    }
}