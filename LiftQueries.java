import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        int A = 0, B = 7;
        while(t-->0){
            int n=in.nextInt();
            if(Math.abs( n - A) == Math.abs(n - B)){
                 System.out.println("A");
                 A = n;
            }
            else if(Math.abs( n - A) < Math.abs(n - B)){
                System.out.println("A");
                A = n;
            } 
            else{
                System.out.println("B");
                B = n;
            } 
        }
    }
}
