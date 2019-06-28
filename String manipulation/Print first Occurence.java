//Good one
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
       Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        
        while(t-->0){
            HashMap<Character,Integer> name=new HashMap<Character,Integer>();
            String st=s.next();
            for(int i=0;i<st.length();i++){
                
                if(!name.containsKey(st.charAt(i))){
                    
                    name.put(st.charAt(i),i);
                    System.out.print(st.charAt(i));
                    
                }
                
            }
            System.out.println();
           
    }
}
}
