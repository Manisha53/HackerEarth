import java.util.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int fact=factorial(n);
        System.out.print(fact);

    }
    public static int factorial(int n){
        
        if(n==0 || n==1) return 1;
        else return(n*factorial(n-1));
    }
}
