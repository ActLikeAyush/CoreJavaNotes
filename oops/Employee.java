
class Employee{

    int id=1;
    String name="SomeOne";
    double salary=122333.1233;
    void sleep(){
        System.out.println("He can sleep");
    }
    void work(){
        System.out.println("he has to work ");
    }
    public static void main(String args[]){
        Employee obj=new Employee();
        obj.sleep();
        obj.work();
        
    }
}