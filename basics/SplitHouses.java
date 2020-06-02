import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        String s=in.next();
        if(s.contains("HH")) System.out.println("NO");
        else{
            String t=s.replace(".","B");
            System.out.println("YES");
            System.out.println(t);
        }
        
    }
}
