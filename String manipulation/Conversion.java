
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
      
      Scanner in=new Scanner(System.in);
      int t=in.nextInt();
      while(t-->=0){
          
          String s=in.nextLine();
          String s1=s.toLowerCase();
          int l=s1.length();
          String res="";
          for(int i=0;i<l;i++){
              if(s.charAt(i)==' '){
                  res+='$';
              }else{
                  res+=Integer.valueOf(s1.charAt(i))-96;
              }
              
          }
         System.out.println(res); 
      }
      
    }
}
