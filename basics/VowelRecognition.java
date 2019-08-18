
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        long c=0;
        while(t-->0){
            c=0;
            String neww=in.next();
            int l=neww.length();
            String s=neww.toLowerCase();
            for(int i=0;i<l;i++){
                if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                    long x=(long)(l-i)*(i+1);
                    c+=x;
                    
                }
                else{
                    continue;
                }
                
            }
            System.out.println(c);
        }

    }
}
