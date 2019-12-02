/*
2
10 2 3 4
10 2 2 4

SAMPLE OUTPUT

4
0

Explanation

Sample test case
:
Note that on days 2 and 10 plane can takeoff, on days3 and 9 plane

can takeoff.

Sample test case

:
Note that there is no day on which there is no collision.

*/


import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in= new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int n=in.nextInt();
            int p=in.nextInt();
            int q=in.nextInt();
            int r=in.nextInt();
            int max=0;
            for(int i=1;i<=n;i++){
                if((i%p==0 && i%q!=0 && i%r!=0)||(i%p!=0 && i%q==0 && i%r!=0)||(i%p!=0 && i%q!=0 && i%r==0)){
                    max++;
                }
            }
            System.out.println(max);
        }
    }
}
