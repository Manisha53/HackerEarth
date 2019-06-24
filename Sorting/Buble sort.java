/0
*/*
Bubble Sort

You have been given an array A of size N . you need to sort this array non-decreasing oder using bubble sort. However, you do not need to print the sorted array . You just need to print the number of swaps required to sort this array using bubble sort

Input Format

The first line consists of a single integer N denoting size of the array. The next line contains N space separated integers denoting the elements of the array.

Output Format Print the required answer in a single line

Constrains

SAMPLE INPUT

5
1 2 3 4 5

SAMPLE OUTPUT

0
*/
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s=new Scanner(System.in);
        
        int n=s.nextInt();
        int c=0,t;
        
        int A[]=new int[n];
        for(int i=0;i<n;i++){
            
            A[i]=s.nextInt();
            
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if( A[j]>A[j+1]){
                    t=A[j];
                    A[j]=A[j+1];
                    A[j+1]=t;
                     c++;
                }
                   
        }        
            
        }
        System.out.println(c);
    }
}
