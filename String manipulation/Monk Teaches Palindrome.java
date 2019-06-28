
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0){
            
            String str=s.next();
            int len=str.length();
            //System.out.println(len);
            char[] a=str.toCharArray();
            int flag=0;
            if(len%2==0){
                for(int i=0;i<=(len/2);i++){
                    if(a[i]!=a[len-1]){
                        flag=0;
                        break;
                    }
                    else if(a[i]==a[len-1]){
                        len--;
                        flag=1;
                    }
                }
                if(flag==1){
                System.out.println("YES"+" EVEN");
                }
                else{
                   System.out.println("NO"); 
                }
                
            }
            
            
            else{
                for(int i=0;i<=(len/2);i++){
                    
                    if(a[i]==a[len-1]){
                        len--;
                        //System.out.println(a[i]);
                        flag=1;
                    }
                   else if(a[i]!=a[len-1]){
                        flag=0;
                        break;
                    }
                }
                if(flag==1){
                System.out.println("YES"+" ODD");
                }
                else{
                   System.out.println("NO"); 
                }
            }
            }
            
    }
}
