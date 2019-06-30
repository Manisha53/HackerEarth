
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        int len=s.length();
        String res="";
        for(int i=0;i<len;i++){
            if(!(res.contains(""+s.charAt(i)))){
                res+=s.charAt(i);
            }
        }
        System.out.print(res);
    }
}
