import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in=new Scanner(System.in);
        // String str=in.next();
        StringBuffer str = new StringBuffer(in.next());
        for(int i=0;i<str.length();i++){
            Character c=str.charAt(i);
            if(Character.isLowerCase(c)){
                 str.replace(i, i+1, Character.toUpperCase(c)+""); 
            }
            else
                str.replace(i, i+1, Character.toLowerCase(c)+"");
        }
        System.out.println(str);
    }
}
