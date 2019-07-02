
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
       Scanner in=new Scanner(System.in);
       int t=in.nextInt();
       int count=0;
       while(t-->=0){
           
           String s=in.nextLine();
           char[] str=s.toCharArray();
           int l=str.length;
           HashMap<Character,Integer> map=new HashMap<Character,Integer>();
           
           for(char c:str){
               //count=0;
               if(map.containsKey(c)){
                   map.put(c,map.get(c)+1);
                   count++;
               }
               else{
                   map.put(c,1);
                   count++;
               }
           }
     
          count=0;
         
          TreeMap<Character, Integer> sorted = new TreeMap<>(map);
          
           
          for (Map.Entry<Character, Integer> entry : sorted.entrySet()) {
              
              for(int i=0;i<entry.getValue();i++)
                System.out.print(entry.getKey());
          } //sort a/c to alphabet
          
        
              System.out.println();
          }
       
    }
}
/*

RESULT: Compiled & Run

Input

3
aabbccdd
aabcc
hackerearth

Your Code's Output

aabbccdd
aabcc
aaceehhkrrt

*/
