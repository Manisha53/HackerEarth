/*You have n rectangles. A rectangle is golden if the ratio of its sides is in between [1.6,1.7]

, both inclusive. Your task is to find the number of golden rectangles.

Input format

    First line: Integer n

 denoting the number of rectangles
Each of the 
 following lines: Two integers 

w and h     denoting the width and height of a rectangle

Output format

    Print the answer in a single line.

Constraints

SAMPLE INPUT

5
10 1
165 100
180 100
170 100
160 100

o/p= 3

*/



import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s=new Scanner(System.in);        
        int t=s.nextInt();
        int c=0;
        while(t-->0){
            
            double w=s.nextDouble();
            double h=s.nextDouble();
            double n=Math.max(w,h)/Math.min(w,h);
            if(n<=1.7 && n>=1.6){
                c++;
            }
        }
        System.out.println(c);
    }
}
