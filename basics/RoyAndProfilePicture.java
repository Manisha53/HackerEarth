
import java.util.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
       
        Scanner in = new Scanner(System.in);
        int l=in.nextInt();
        int n=in.nextInt();
        while(n-->0){
             int w=in.nextInt();
             int h=in.nextInt();
             if(w<l || h<l) System.out.println("UPLOAD ANOTHER");
             else{
                 if(w==h) System.out.println("ACCEPTED");
                 else System.out.println("CROP IT");
             }
        }
       
    }
}
