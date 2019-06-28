
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0){
            
            String str=s.next();
            int n=s.nextInt();
            int m=s.nextInt();
            
            String as=str.substring(n,m+1);
            char[] a=as.toCharArray();
            Arrays.sort(a);
            int l=a.length-1;
            
            char[] b=str.toCharArray();
                
                for(int j=n;j<=m;j++){
                    
                    b[j]=a[l];
                    l--;
                }
            System.out.println(new String(b));
        }
        
    }
}
