import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in=new Scanner(System.in);
        int l=in.nextInt();
        int r=in.nextInt();
        int k=in.nextInt();
        int count=0;
        for(int i=l;i<=r;i++){
            if(i%k==0) count++;
        }
        System.out.println(count);
    }
}
