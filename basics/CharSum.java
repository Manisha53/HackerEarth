import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        int sum=0;
        
        for(int i=0;i<s.length();i++){
        
            sum+=s.charAt(i)-'a'+1;
        }
        System.out.println(sum);
    }
}
