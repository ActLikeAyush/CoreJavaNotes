class EmployeeP{
    int id;
    String name;
    int age;
    EmployeeP(int i,int a,String n){
        id=i;
        age=a;
        name=n;
    }
    void display(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(age);
    }
}
class Parameterized{
    public static void main(String args[]){
        EmployeeP e=new EmployeeP(1,22,"someOne");
        e.display();
    }
}