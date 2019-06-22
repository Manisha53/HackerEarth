//solution 1:but time limit exceeded.

import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner s= new Scanner(System.in);
        int t=s.nextInt();
        int sum=0,min=0;
        while(t-->0){
            
            int n=s.nextInt();
            int a=s.nextInt();
            int b=s.nextInt();
            
            min=b*n*n;                       //for i=0
                for(int i=1;i<n+1;i++){
                    sum=0;
                    
                    sum=a*(i*i) + b*(n-i)*(n-i);
                
                    if(sum<=min){
                        min=sum;
                    }
                }
                System.out.println(min);
                
        }
        
    }
}

//soltuion 2:optimised

import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner s= new Scanner(System.in);
        long t=s.nextLong();
        long sum=0,min=0;
        while(t-->0){
            
            long n=s.nextLong();
            long a=s.nextLong();
            long b=s.nextLong();
            
            long i=(b*n)/(a+b);
            min=a*(i*i)+b*(n-i)*(n-i);
            i++;
            sum=a*(i*i)+b*(n-i)*(n-i);
            
            if(sum<=min){
                min=sum;
            }
        System.out.println(min);        
        }
        
        
    }
}

