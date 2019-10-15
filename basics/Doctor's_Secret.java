
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in=new Scanner(System.in);
        int l=in.nextInt();
        int n=in.nextInt();
        if( l<=23 && 500<n && n<=1000){
            System.out.println("Take Medicine");
        }
        else{
            System.out.println("Don't take Medicine");
        }

    }
}
