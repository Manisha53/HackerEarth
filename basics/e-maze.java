
import java.util.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        int len=s.length();

        int x=0,y=0;       //coordinates
        for(int i=0;i<len;i++){
            if(s.charAt(i)=='L') x--;
            if(s.charAt(i)=='R') x++;
            if(s.charAt(i)=='U') y++;
            if(s.charAt(i)=='D') y--;
        }
        System.out.println(x+" "+y);

    }
}
