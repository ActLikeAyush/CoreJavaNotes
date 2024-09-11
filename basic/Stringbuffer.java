class Stringbuffer{
    public static void main(String args[]){
        StringBuffer s =new StringBuffer();
        // s.append("java");
        // System.out.println(s);
        // s.insert(2,"JS");
        // System.out.println(s);
        // s.delete(2,4);
        // System.out.println(s);
        // s.deleteCharAt(2);
        System.out.println(s);
        s.append("js");

        System.out.println(s.capacity());
        s.append("hy again welcome to m world here we do something");
        System.out.println(s);
        s.append("hy");
        System.out.println(s.capacity());
    }
}