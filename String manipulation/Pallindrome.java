
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in =new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int flag=0;
            String s=in.next();
           
            int l=s.length();
            String res="";
            for(int i=l-1;i>=0;i--){
                res+=s.charAt(i);
            }
            if(res.equals(s)){
                System.out.println("YES");
            }
            else{
                 System.out.println("NO");
            }
            
        }

    }
}
