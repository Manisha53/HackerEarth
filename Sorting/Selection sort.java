/*

Selection Sort

    Consider an Array a of size N
    Iterate from 1 to N
    In 

iteration select the minimum and swap it with

You are given an array a, size of the array N and an integer x. Follow the above algorithm and print the state of the array after x iterations have been performed.

Input Format

The first line contains two integer N and x denoting the size of the array and the steps of the above algorithm to be performed respectively. The next line contains N space separated integers denoting the elements of the array.

Output Format

Print N space separated integers denoting the state of the array after x steps

Constraints

SAMPLE INPUT

5 2
1 2 3 4 5

SAMPLE OUTPUT

1 2 3 4 5


*/

import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int x=s.nextInt();
        int a[]=new int[n];
        int min;
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        
           for(int i=0;i<x;i++){                 //since,only x swaps.
               min=i;
               for(int j=i+1;j<n;j++){
                   
                   if(a[j]<a[min]){
                       min=j;
                   }
                   
               }
               int t=a[min];
               a[min]=a[i];
               a[i]=t;
           } 
        
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        
    }
}
