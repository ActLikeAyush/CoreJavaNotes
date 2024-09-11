class stringFirst{
    public static void main(String args[]){
        String s1="welcome";
        String s2=new String("welcome");
        String s3="Welcome";
        String s4="java";
        System.out.println(s1==s3);  //it will check object
        System.out.println(s1==s4);
        System.out.println(s1==s2);
        System.out.println(s1.equals(s4));  //it will check contant
        System.out.println(s1.equals(s2));

        //method of String 
            //lenght()
        System.out.println(s1.length());
            //charAt(index)
        System.out.println(s1.charAt(0));
        System.out.println(s1.charAt(1));
            //indexOf('char')
        System.out.println(s1.indexOf('e'));
        // System.out.println(s1.indexOf('e',0,2));
        System.out.println(s1.indexOf("l",0));    
            //lastIndexOf()
        System.out.println(s1.lastIndexOf('e'));
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
            //.equals()
        System.out.println(s1.equals(s3));    
            //.equalsIgnoreCase()
        System.out.println(s1.equalsIgnoreCase(s3));  
            // /contains()
        System.out.println(s1.contains("wel"));    
        System.out.println(s1.contains("come"));  
            //isEmpty()
        System.out.println(s1.isEmpty()); 
            //startsWith()
            //endsWith()
        System.out.println(s1.startsWith("wel"));
        System.out.println(s1.endsWith("me"));    
            //concat()
        System.out.println(s1.concat(" "+s4));
            //subString(StartIndex,endIndex)
        System.out.println(s1.substring(1,3)); 
            //join
        String []str={"welcome","to","java"};    
        String res=String.join("/",str);
        System.out.println(res);    
        System.out.println(s1.replace("come","bye"));
            //valueOf()
        int i=10;
        String con=String.valueOf(i);
        con=con+10;
        System.out.println(con);
            //SubSequence()
        System.out.println(s1.subSequence(1,2));
        

    }
}