class OpLogical{
    public static void main(String args[]){
        int a=10;
        int b=20;
        int c=30;
        System.out.println(a==b&&a<b);
        System.out.println(a>=c||c==b);
        System.out.println(a!=b&&c==b);
        System.out.println(!(a!=b || c==c));
       
        
    }
}