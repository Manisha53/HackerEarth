
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        in.nextLine();             //trick
        while(t-->0){
            
            String str=in.nextLine();
            
            String[] ar=str.split(" ");
            
            //System.out.println(ar[ar.length-1]);
            for(int i=ar.length-1;i>=0;i--){
             System.out.print(ar[i]+" ");
            }
        System.out.println();
        }

    }
}
