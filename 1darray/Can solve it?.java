//timedout for 7 testcases out of 9
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
    Scanner in =new Scanner(System.in);
    int t=in.nextInt();
    while(t-->0){
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        int max=-999;
        int m=0;
        for(int i=0;i<n;i++){
            int j=i+1;
            while(j<n){
                m=((a[i]>a[j])?a[i]-a[j]:a[j]-a[i]);
                m+=((i>j)?i-j:j-i);
                if(m>max){
                    max=m;
                }
                j++;
            }
        }
        System.out.println(max);
    }
}

}
