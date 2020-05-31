import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        while(n-->0){
            int sh=in.nextInt();
            int sm=in.nextInt();
            int eh=in.nextInt();
            int em=in.nextInt();
            int min=(eh-sh)*60 + (em-sm);
        
            int hours=min/60;
            int minutes=min%60;
            System.out.println(hours+" "+minutes);

        }
    }
}
