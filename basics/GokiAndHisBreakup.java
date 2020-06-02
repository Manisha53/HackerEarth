
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int x=in.nextInt();
        while(n-->0){
            int y=in.nextInt();
            if(y>=x) System.out.println("YES");
            else  System.out.println("NO");
        }
    }
}
