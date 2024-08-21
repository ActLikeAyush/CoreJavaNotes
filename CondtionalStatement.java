class CondtionalStatement{
    public static void main(String args[]){
        int a=10;
        int b=-20;
        // check the number is Positive or nagative
        if(a>=0){
            System.out.println("Number is Positive"+a);
        }
        else{
            System.out.println("Number is Nagative"+a);
        }
        // check the number is even or odd 
        if(a%2==0){
            System.out.println("Number is Even Number");
        }
        else{
            System.out.println("Number is Odd Number");
        }
        // check eligible for voting or not 
        if(a>=18){
            System.out.println("Eligible for Voting");
        }
        else{
            System.out.println("Not Eligible for Voting");
        }
        // check the person is senior citizen or not 
        if(a>=60){
            System.out.println("You are senior citizen");
        }
        else{
            System.out.println("You are not senior");
        }
        // else if ladder
        String state="Uttar Pradesh";
        if(state=="Madhya Pradesh"){
            System.out.println("Bhopal");
        }
        else if(state=="Uttar Pradesh"){
            System.out.println("Lucknow");
        }
        else if(state=="Karnataka"){
            System.out.println("Bangalore");
        }
        else{
            System.out.println("Your are From Pakistan");
        }
        


    }
} 