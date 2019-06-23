/*

Bishu and Soldiers

Binary Search, Brute Force, Very-Easy, Very-Easy

Bishu went to fight for Coding Club. There were N soldiers with various powers. There will be Q rounds to fight and in each round Bishu's power will be varied. With power M, Bishu can kill all the soldiers whose power is less than or equal to M(<=M). After each round, All the soldiers who are dead in previous round will reborn.Such that in each round there will be N soldiers to fight. As Bishu is weak in mathematics, help him to count the number of soldiers that he can kill in each round and total sum of their powers.

1<=N<=10000

1<=power of each soldier<=100

1<=Q<=10000

1<=power of bishu<=100
SAMPLE INPUT

7
1 2 3 4 5 6 7
3
3
10
2

SAMPLE OUTPUT

3 6
7 28
2 3

Explanation

In first round bhishu power is 3

So there are 3 soldiers whose power is <=3 and the sum of their power is 1+2+3=6

therefore ans= 3 6

same for the next round


*/
import java.util.*;

class TestClass {
public static void main(String args[] ) throws Exception {
int j,i;
int sum=0,power,c=0;
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] ar=new int[n];
for(i=0;i<n;i++)
ar[i]=sc.nextInt();

int q=sc.nextInt();

while(q-->0)
{
power=sc.nextInt();
for(j=0;j<n;j++)
{
if(power>=ar[j]){
    c++;
    sum+=ar[j];
}
}
System.out.println(c+" "+sum);
sum=0;
c=0;
}
}
}
