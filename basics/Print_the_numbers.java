
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in=new Scanner(System.in);
        ArrayList<Integer> a=new ArrayList<Integer>();
        int n=in.nextInt();
        while(in.hasNext()){
             a.add(in.nextInt());
        }
       
        for(int i=0;i<a.size();i++){
            System.out.print(a.get(i)+" ");
        }
    }
}
