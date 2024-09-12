class Something{
    int id;
    String name;
    double s;

    Something(){
        id=1;
        name="abc";
        
    }
    Something(id,name){
        id
    }
    void display(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(s);
    }
}
class Default{
    public static void main(String args[]){
        Something s=new Something();
        s.display();
    }
}