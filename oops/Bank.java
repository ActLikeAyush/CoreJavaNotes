class Bank{
    String name;
    String ifscCode;
    String Branch;
    long accountNumber;
    void deposit(){
        System.out.println("Someone deposit money");
    }
    void withDrow(){
        System.out.println("Paise De Xyz");
    }
    void Transection(){
        System.out.println("Transtion done.....");
    }
    Bank(){
        System.out.println("object created");
    }
    public static void main(String args[]){
        Bank obj=new Bank();
        obj.Transection();
        obj.deposit();
        obj.withDrow();
        
    }
}
