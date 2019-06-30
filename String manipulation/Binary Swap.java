import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
    
        Scanner in=new Scanner(System.in);
        String a=in.nextLine();
        String b=in.nextLine();
        
        int l=a.length();
        int count1=0;
        int count2=0;
        for(int i=0;i<l;i++){
            if(a.charAt(i)-b.charAt(i)<0){
               count1++;
            }
            else if(a.charAt(i)-b.charAt(i)>0){
                count2++;
            }
        }
        if(count1==count2){
        System.out.println(count1);
        }
        else{
            System.out.println(-1);
    }
}}
