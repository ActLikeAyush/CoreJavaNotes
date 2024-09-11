import java.util.*;
class practiceSet1{
    public static void main(String arg[]){
        
        Scanner sc=new Scanner(System.in);
        //write a program to check whether a person is eligible for voting or not(accept age from user)
        System.out.println("Enter Your Age");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("You are eligible for voting");
        }
        else{
           System.out.println("You are not eligible for voting"); 
        }
        //write a program to check whether a number entered by user is even or odd
        System.out.println("Enter any number");
        int check=sc.nextInt();
        if(check%2==0){
            System.out.println("Number is even"); 
        }
        else{
        System.out.println("Number is odd"); 
        }
        //write a program to check whether a number is divisible by 7 or not
        System.out.println("Enter any number");
        int div=sc.nextInt();
        if(div%7==0){
            System.out.println("Number is divisible by 7"); 
        }
        else{
            System.out.println("Number is not divisible by 7"); 
        }
        //write a program to check whether a number is multiple of five
        System.out.println("Enter any number");
        int multi=sc.nextInt();
         if (num % 5 == 0) {
            System.out.println("hello");
        } else {
            System.out.println("Bye");
        }

        //electricity bill
        System.out.println("Enter Your electricity unit");
        int bill=sc.nextInt();
        
        if(bill<100){
            System.out.println("no charge ");
        }
        else if(bill>100 && bill<200){
            bill=bill*5;
            System.out.println("your bill is: "+bill);
        }
        else {
            bill=bill*10;
            System.out.println("your bill is: "+bill);
        }
        // return the last digit number
        System.out.println("Enter Your num it will return last digit");
        int num=sc.nextInt();
        num=num%10;
        System.out.println("last digit is: "+num);

        //check the last digit of enterd number is divisible by 3 or not
        System.out.println("Enter Your num it will return last digit");
        int num1=sc.nextInt();
        num1=num1%10;
        if(num1%3==0){
            System.out.println("your number is divisible by 3 ");
        }
        else{
            System.out.println("your number is not divisible by 3 ");
        }

        
        
    }
}