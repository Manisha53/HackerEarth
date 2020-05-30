import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
      Scanner in=new Scanner(System.in);
      int tEST=in.nextInt();
      while(tEST-->0){
          String s1=in.next();
          String s2=in.next();
          char s[]=s1.toCharArray();
          char t[]=s2.toCharArray();
          int l=s.length;
          Arrays.sort(s);
          Arrays.sort(t);
          String x=Arrays.toString(s);
          String y=Arrays.toString(t);
        
          if(x.equals(y)) System.out.println("YES");
          else System.out.println("NO");
      }
    }
}
