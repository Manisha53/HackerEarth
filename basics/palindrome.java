import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
    //     StringBuilder rev=new StringBuilder();
    //   // StringBuilder s=new StringBuilder();
    //   rev.append(s);
    //      rev=rev.reverse();
    String rev="";
    for(int i=s.length()-1;i>=0;i--){
        rev+=s.charAt(i);
    }
        if(s.equals(rev)){
            System.out.println("YES");
        }
        else{
             System.out.println("NO");
        }
    }
}
