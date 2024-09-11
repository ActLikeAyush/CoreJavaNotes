class Array{
    public static void main(String args[]){
        
        int [] array1={1,2,3,4,5,6,7,8};
        for(int i=0;i<8;i++){
            System.out.println(array1[i]);
        }
        
        int [] array=new int[5];
            array[0]=10;
            array[1]=10;
            array[2]=10;
            array[3]=10;
            array[4]=10;
            for(int j=0;j<4;j++){
                System.out.println(array[j]);
            }
            for(int a:array){
                System.out.println("using for each"+a);
            }

            // two D array 
            
    }
}    