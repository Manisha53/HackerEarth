import java.util.*;
import java.io.*;
public class TestClass {
public static void main(String args[]) {
Scanner scan = new Scanner(System.in);

int size = scan.nextInt();
Stack<Integer> stack = new Stack<>();
for(int i=0;i<size;i++) {
int value = scan.nextInt();
if(value % 2 == 0) {
stack.push(value);
} else {
while(!stack.isEmpty()) {
System.out.print(stack.pop()+" ");
}
System.out.print(value+" ");
}
}
while(!stack.isEmpty()) {
System.out.print(stack.pop()+" ");
}

}
}
