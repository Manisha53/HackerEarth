
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
       Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       int a[]=new int[n];
       int f=0;
       for(int i=0;i<n;i++){
           a[i]=in.nextInt();
       }
       for(int i=0;i<n-1;i++){
            f=0;
           for(int j=i+1;j<n;j++){
              
               if(a[i]>=a[j]){
                  f++;
               }
               else{
                   break;
               }
           }
           if(f==n-1-i){
               System.out.print(a[i]+" ");
           }
       }
System.out.print(a[n-1]);
    }
}
