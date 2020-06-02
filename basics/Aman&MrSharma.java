import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in=new Scanner(System.in);
        int d=in.nextInt();
         int toffee=0;
        while(d-->0){
            
            int r=in.nextInt();
            int x=in.nextInt();
            
            if(700*x>=44*r)
                toffee++;
           
        }
         System.out.println(toffee);
    }
}
