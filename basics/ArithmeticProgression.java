
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in=new Scanner(System.in);
        long t=in.nextLong();
        while(t-->0){
            long a=in.nextLong();
            long b=in.nextLong();
            long c=in.nextLong();
            long count=Math.abs(2*b-(a+c));
            count=(count+1)/2;
        
            System.out.println(count);
        }
    }
}
