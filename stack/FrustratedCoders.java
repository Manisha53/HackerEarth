//import for Scanner and other utility classes
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in =new Scanner(System.in);
        int sum=0;
        int n=in.nextInt();
        int s[]=new int[n];
        for(int i=0;i<n;i++){
            s[i]=in.nextInt();
        }
        Arrays.sort(s);
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++){
            stack.push(s[i]);
        }
        for(int i=n-1;i>=0;i--){
            if(s[i]<stack.peek()){
                s[i]=0;
                stack.pop();
            }
        }
        for(int i=0;i<n;i++){
            
            sum+=s[i];
        }
        System.out.println(sum);
    }
}
