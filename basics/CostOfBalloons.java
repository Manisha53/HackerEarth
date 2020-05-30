
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int sum1=0,sum2=0,sum3=0,sum4=0;
            int first=in.nextInt();
            int sec=in.nextInt();
            int num=in.nextInt();
            int a[][]=new int[num][2];
            for(int i=0;i<num;i++){
                for(int j=0;j<2;j++){
                    a[i][j]=in.nextInt();
                }
            }

            for(int i=0;i<num;i++){
                    sum1+=a[i][0]*first;
                    sum2+=a[i][1]*sec;
                    sum3+=a[i][0]*sec;
                    sum4+=a[i][1]*first;
            }
            System.out.println(Math.min(sum1+sum2,sum3+sum4));
            
        }

    }
}
