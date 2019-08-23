//not optimised
import java.util.*;
class TestClass {
public static void main(String args[] ) throws Exception {
Scanner s=new Scanner(System.in);
int t=s.nextInt();
while(t-->0){

int n=s.nextInt(),k=s.nextInt();

LinkedList<Integer> l=new LinkedList<>();

for(int j=0;j<n;j++)
l.add(s.nextInt());


while(k-->0){

for(int i=0;i<n;i++){
if(i+1<n && l.get(i)<l.get(i+1)){
l.remove(l.get(i));
break;
}
}


}
for(int j:l)
System.out.print(j+" ");
System.out.println();


}
}
}
