
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int i=5;
        int s=0;
        while(i>0){
            s=s+n/i;
            n=n%i;
            i--;
        }
        System.out.println(s);
    }
}
