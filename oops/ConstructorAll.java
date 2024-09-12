class Emp{
    int id;
    int age;
    String name;
    Emp(int id, int age,String name){
        this.id=id;
        this.name=name;
        this.age=age;
    }
    void Dis(){
        System.out.println(id+"\n"+age+"\n"+name);
    }
}
class Bank{
    void sleep(){
        System.out.println("hi hello");

    }
    void read(){
        this.sleep();
        System.out.println("i am reading");
    }
}
class Stu{
    int value;
    Stu(int value){
        this();
        System.out.println(value+" this value is from parametrized");
    
    }
    Stu(){
        
        System.out.println("This is deafult");
    }
}
class ConstructorAll{
    public static void main(String args[]){
        Emp E=new Emp(1,22,"someOne");
        E.Dis();
        Bank b=new Bank();
        b.read();
        Stu s=new Stu(69);

    }
}