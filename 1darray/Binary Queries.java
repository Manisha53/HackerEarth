
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int q=in.nextInt();
         int a[]=new int[n+1];
        for(int i=1;i<=n;i++){
            a[i]=in.nextInt();
        }
        while(q-->0){
            int one=in.nextInt();
            if(one==1){     //flip
                int f=in.nextInt();
                 if(a[f]==0){
                a[f]=1;
            }
            else{
                a[f]=0;
            }
            }
            else{       //find even/odd
            int l=in.nextInt();
            int r=in.nextInt();
           
            
            if(a[r]==0){
                System.out.println("EVEN");
            }
            else{
                System.out.println("ODD");
            }
            }
            
            
        }
    }
}
