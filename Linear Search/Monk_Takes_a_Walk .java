/*Monk Takes a Walk 
Today, Monk went for a walk in a garden. There are many trees in the garden and each tree has an English alphabet on it. While Monk was walking, he noticed that all trees with vowels on it are not in good state. He decided to take care of them. So, he asked you to tell him the count of such trees in the garden.
Note : The following letters are vowels: 'A', 'E', 'I', 'O', 'U' ,'a','e','i','o' and 'u'.
Input:
The first line consists of an integer T denoting the number of test cases.
Each test case consists of only one string, each character of string denoting the alphabet (may be lowercase or uppercase) on a tree in the garden.
Output:
For each test case, print the count in a new line.
*/

import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        //char arr[]=new char[t];
        
        while(t-->0){
            
            
            char arr[]=s.next().toCharArray();
            
            int count=0;
            
            for(int i=0;i<arr.length;i++){
                if(arr[i]=='a'|| arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'||arr[i]=='O'||arr[i]=='I'||arr[i]=='E'||arr[i]=='A'||arr[i]=='U'){
                    
                    count++;
                    
                }
                // else{
                //     continue;
                // }
            }
        System.out.println(count);    
        }

    }
}
