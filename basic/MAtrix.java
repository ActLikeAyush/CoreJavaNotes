import java.util.*;
class MAtrix{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of row");
        int row=sc.nextInt();
        System.out.println("Enter the size of column");
        int column=sc.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}