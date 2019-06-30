import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->=0){
            
            String s=in.nextLine();
            char[] st=s.toCharArray();
            
            for(int i=0;i<st.length;i++){
                System.out.print(st[st.length-i-1]);
            }
            System.out.println();
        }
    }
}
