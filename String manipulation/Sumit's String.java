//good one
import java.util.*;
import java.lang.Math.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
       
        int val=0;
        while(t-->0){
             int flag= 1;
            String s=in.next();
            char[] a=s.toCharArray();
            int l=a.length;
            for(int i=0;i<l-1;i++){
                val=Math.abs(a[i+1]-a[i]);
                if(val==25)
                    val=1;
                
                if(val!=1){
                    flag=0;
                    break;
                }
                
                
            }
            if(flag==0){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
            
        }

    }
}
