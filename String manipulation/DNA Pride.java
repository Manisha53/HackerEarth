//import for Scanner and other utility classes
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s=new Scanner(System.in);
        long t=s.nextLong();
        while(t-->0){
            
            long n=s.nextLong();
            String a=s.next();
            
            char ar[]=a.toCharArray();
            int flag=1;
          
            for(int i=0;i<ar.length;i++){
                switch(ar[i]){
                    case 'A':
                        ar[i]='T';
                        break;
                    case 'T':
                        ar[i]='A';
                        break;
                    case 'G':
                        ar[i]='C';
                        break;
                    case 'C':
                        ar[i]='G';
                        break;
                    default:
                    flag=0;
                    break;
                }
                
            }
            if(flag==0){
                 System.out.print("Error RNA nucleobases found!");
            }
            else{
                 System.out.print(ar);
            }
            System.out.println();
        }

    }
}
