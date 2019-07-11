import java.util.*;
// import java.io.BufferedReader;
// import java.io.InputStreamReader;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
      
       if(t<1 || t>10){
           System.out.println("Invalid Test");
           return;
       }
       while(t-->0) {
           String s=in.next();
           int l=s.length();
           if(l<0 || l>100){
               System.out.println("Invalid Input");
               continue;
           }
           int lower=0,upper=0;
           boolean flag=false;
           for(int i=0;i<l;i++){
               char c=s.charAt(i);
               if(c==' '){
                   flag=true;
                   break;
               }
               if(c>='a' && c<='z'){
                   lower++;
               }else if(c>='A' && c<='Z'){
                   upper++;
               }
           }
           if(flag || lower+upper==0){
               System.out.println("Invalid Input");
           }else{
               System.out.println(Math.min(lower,upper));
           }
       }
 
    }
}
