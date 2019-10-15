
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        if(a>b){
            if(a>c){
                System.out.println(a);
            }
            
        }
         else if(c>a){
             if(c>b){
                  System.out.println(c);
             }
               
            }
        else{
            System.out.println(b);
        }
    }
}
