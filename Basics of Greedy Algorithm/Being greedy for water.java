import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        int c=0;
        while(t-->0){
            int n=s.nextInt();
            int x=s.nextInt();
            int capacity[]=new int[n];
            for(int i=0;i<n;i++){
                capacity[i]=s.nextInt();
            }
            
            //maximise no. of bottles to be filled so sort in increasing order.
            sorti(capacity,n);
            int k=0;
            while(x>=0 && k<n){
                x=x-capacity[k];
                k++;
                c++;
            }
        }

System.out.println(c);
    }
    
    private static void sorti(int capacity[],int n){
         
            for(int i=0;i<n-1;i++){
                int temp;
                for(int j=1;j<n-1-i;j++){
                    if(capacity[j]>capacity[j+1]){
                        
                        temp=capacity[j];
                        capacity[j]=capacity[j+1];
                        capacity[j+1]=temp;
                        
                    }
                }
            }
    }
}

//time limit exceeded

import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
       
        while(t-->0){
            int n=s.nextInt();
            int x=s.nextInt();
            int capacity[]=new int[n];
            for(int i=0;i<n;i++){
                capacity[i]=s.nextInt();
            }
            
            //maximise no. of bottles to be filled so sort in increasing order.
            Arrays.sort(capacity);
            int c=0;
            for(int i=0;i<n;i++){
                if(capacity[i]<x){
                x=x-capacity[i];
                c++;
            }
            else{
                break;
            }
        }
        System.out.println(c);
}

    }
}
//optimised code
