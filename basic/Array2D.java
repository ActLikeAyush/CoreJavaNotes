import java.a
class array2D{
    public static void main(String args[]){
        int [][]array2D={{1,2,3,4},{4,3,2,1}};
            for(int row=0;row<4;row++){
                for(int column=0;column<4;column++){
                    System.out.println("this 2d array"+array2D[row][column]);
                }
            }
            int [] arr={1,2,3,4};
            System.out.println(Array.toString(arr));
            int [][]a22D=new int[1][1];
            a22D[0][0]=1;
            a22D[0][1]=2;
            a22D[1][0]=3;
            a22D[1][1]=4 ;   
            for(int i=0;i<=1;i++){
                for(int j=0;j<=1;j++){
                    System.out.println("seconf way "+a22D[i][j]);
                }
            }
    }
}