import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        long ans=1;
        
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
            ans=(ans*a[i])%((long)Math.pow(10,9)+7);
            
        }
        System.out.println(ans);
    }
}
