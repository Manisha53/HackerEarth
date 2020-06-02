import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            int x=in.nextInt();
            if(x==42) break;
            System.out.println(x);
        }

    }
}
