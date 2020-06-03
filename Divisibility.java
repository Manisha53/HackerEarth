import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);
        int N = 0;
        N = s.nextInt();
        String ans="";
        int[] data = new int[N];
        for(int i=0; i<N; i++){
            data[i] = s.nextInt();
        }
        int x=data[N-1];
        if(x%10==0) ans="Yes";
        else ans="No";
    
        System.out.println(ans);
        // return 0;
    }
}
