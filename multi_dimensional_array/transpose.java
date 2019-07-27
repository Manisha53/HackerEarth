
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int a[][]=new int[n][m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=in.nextInt();
            }
        }
        //heart
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }
//heart ends
    }
}
