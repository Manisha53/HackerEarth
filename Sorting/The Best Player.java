/*
It's Lolympics 2016 right now, and we all know who's the best player there right now: Kalyani! Obviously, he has a huge female fan following and he has to make sure they are all happy and rooting for him to win the gold medals.

But with fan following comes arrogance and lack of time. Thus, he has sufficient time to interact with atmost T of his fans. Each fan is defined by two parameters : Name and Fan Quotient. The name defines the name of the fan, while the fan quotient is a measure of the fan's devotion towards Kalyani. Higher the fan quotient, greater is the devotion. Kalyani now wants to meet T of his fans. While selecting the fans he wants to meet, he wants to make sure that a fan with a higher fan quotient should be given a chance in favour of those with lesser fan quotient. In case of ties, he sorts their name lexicographically and chooses the lexicographically lesser named fan.

Given details of N fans, can you help out Kalyani by giving him a list of fans he would be interacting with?

Input Format :

The first line contains N and T, the number of fans and the maximum number of fans Kalyani can meet. Each of the next N lines contains a string and an integer separated by a space. The string denotes the name of the fan while the integer depicts the fan quotient.

Output Format :

Output T lines, each containing the name of the fans selected. Fans with higher fan quotient should be outputted first and in case of a tie, the lexicographically minimum name should come first.

Constraints :

Name would only consist of characters in set [a-z]. It is not guaranteed that the names are distinct.
SAMPLE INPUT

3 2
surbhi 3
surpanakha 3
shreya 5

SAMPLE OUTPUT

shreya
surbhi

Explanation

We can see that the ordering would be {"shreya", "surbhi", "surpanakha"}. Hence the best two are shreya and surbhi.


*/
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
       Scanner s= new Scanner(System.in);
       int n=s.nextInt();
       int t=s.nextInt();
       
           String name[]=new String[n];
           int q[]=new int[n];
           for(int i=0;i<n;i++){
               name[i]=s.next();
               q[i]=s.nextInt();
               
           }
           
           sorti(name,q);
           for(int i=0;i<t;i++){
           System.out.println(name[i]);
           }
           
       }

    private static void sorti(String[] name,int[] q){     //for sorting in decreasing order A/C to q and lexicographically.
        
        int temp2;
        String temp1;
        boolean swapped=false;
        for(int i=0;i<q.length-1;i++){
            for(int j=0;j<name.length-i-1;j++){            //name.length=q.length ,so any of them can be used
                if(q[j]<q[j+1]){
                    temp2=q[j];
                    q[j]=q[j+1];
                    q[j+1]=temp2;
                    
                    temp1=name[j];
                    name[j]=name[j+1];
                    name[j+1]=temp1;
                    swapped=true;
                }
                
                else if(q[j]==q[j+1]){
                    if(name[j].compareTo(name[j+1])>0){
                         temp1=name[j];
                        name[j]=name[j+1];
                        name[j+1]=temp1;
                        swapped = true;
                    
                    }
                    
                }
            }
            if (!swapped) {
                        break;
                    }
        }
    }
}
