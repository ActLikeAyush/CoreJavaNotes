class Fibonacci{
    int fibonacci(int num){
        if(num==1||num==2){
            return 1;
        }
        else{
            return fibonacci(num-1)+fibonacci(num-2);
        }
    }
    public static void main(String args[]){
        Fibonacci fib=new Fibonacci();
        System.out.println(fib.fibonacci(6));
        
      
    }
}