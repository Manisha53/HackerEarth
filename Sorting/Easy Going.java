/*
Coders here is a simple task for you, you have given an array of size N and an integer M.
Your task is to calculate the difference between maximum sum and minimum sum of N-M elements of the given array.



Constraints:
1<=t<=10
1<=n<=1000
1<=a[i]<=1000

Input:
First line contains an integer T denoting the number of testcases.
First line of every testcase contains two integer N and M.
Next line contains N space separated integers denoting the elements of array
Output:
For every test case print your answer in new line


SAMPLE INPUT

1
5 1
1 2 3 4 5

SAMPLE OUTPUT

4

Explanation

M is 1 and N is 5 so you have to calculate maximum and minimum sum using (5-1 =) 4 elements.
Maximum sum using the 4 elements would be (2+3+4+5=)14.
Minimum sum using the 4 elements would be (1+2+3+4=)10.
Difference will be 14-10=4.

*/
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        int min,max,res,ans;
        
        while(t-->0){
            
              int n=s.nextInt();
              int m=s.nextInt();
              res=n-m;
              int[] a=new int[n];
              for(int i=0;i<n;i++){
                  
                  a[i]=s.nextInt();
              }
              for(int k=0;k<n-1;k++){
                  for(int j=0;j<n-k-1;j++){
                      if(a[j]>a[j+1]){
                          int temp=a[j];
                          a[j]=a[j+1];
                          a[j+1]=temp;
                      }
                  }
              }
            
            min=0;
            max=0;
            
            for(int x=n-1;x>=n-res ;x--){
                max+=a[x];
            }
            
            for(int j=0;j<res;j++){
                min+=a[j];
            }  
                // System.out.println("max"+max);
                // System.out.println("min"+min);
                        
            ans=max-min;
            System.out.println(ans);
            
        }
        
        
    }
}
