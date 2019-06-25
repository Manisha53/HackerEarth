/*
A new deadly virus has infected large population of a planet. A brilliant scientist has discovered a new strain of virus which can cure this disease. Vaccine produced from this virus has various strength depending on midichlorians count. A person is cured only if midichlorians count in vaccine batch is more than midichlorians count of person. A doctor receives a new set of report which contains midichlorians count of each infected patient, Practo stores all vaccine doctor has and their midichlorians count. You need to determine if doctor can save all patients with the vaccines he has. The number of vaccines and patients are equal.

Input Format

First line contains the number of vaccines - N. Second line contains N integers, which are strength of vaccines. Third line contains N integers, which are midichlorians count of patients.

Output Format

Print a single line containing Yes
or No.
Input Constraint

Strength of vaccines and midichlorians count of patients fit in integer.

Problem Setter: Practo Tech Team
SAMPLE INPUT

5
123 146 454 542 456
100 328 248 689 200

SAMPLE OUTPUT

No

*/

import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int v[]=new int[n];
        int p[]=new int[n];
        String res="No";
        
        for(int i=0;i<n;i++){
            v[i]=s.nextInt();
            
        }
        for(int i=0;i<n;i++){
            p[i]=s.nextInt();
        }
        sorti(v);
        sorti(p);
        for(int i=0;i<n;i++){
            if(v[i]>p[i]){
                res="Yes";
            }
            else{
                res="No";
                break;
            }
        }
        
        System.out.println(res);
    }
    
    private static void sorti(int a[]){
        int temp;
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }
        
    }
}
