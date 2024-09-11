import java.util.*;
class print2dArray
{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] arr1=new int[r][r];
        int[][] arr2=new int[c][c];
        System.out.println("Enter Element in 1st 2D array");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr1[i][j]=sc.nextInt();
                
            }
        }
        System.out.println("Enter Element in 2nd 2D array");
        for(int k=0;k<r;k++){
            for(int l=0;l<c;l++){
                arr2[k][l]=sc.nextInt();
                
            }
        }
        int[][] sum=new int[r][r];
        for(int u=0;u<r;u++){
            for(int p=0;p<r;p++){
                sum[u][p]=arr1[u][p]+arr2[u][p];
            }
        }
        System.out.println("sum here");
        for(int m=0;m<r;m++){
            for(int n=0;n<r;n++){
                System.out.print(sum[m][n]);
            }
            System.out.print("\n");
        }
    
    for(int o=0;o<r;o++){
            for(int p=0;p<r;p++){
                System.out.print(arr2[o][p]);
            }
            System.out.print("\n");
        }
    }
    
}