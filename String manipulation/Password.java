

import java.util.*;

class TestClass {
public static void main(String args[] ) throws Exception {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
String[] str = new String[n];
String temp1 = sc.nextLine();
for(int i = 0 ; i < n ; i++ ){
str[i] = sc.nextLine();
}

int temp = 0 ;
char ch = ' ';

for(int i = 0 ; i < n ; i++){
StringBuffer sb = new StringBuffer(str[i]);
str[i] = sb.reverse().toString();
for(int j = i+1 ; j < n ; j++){
if(str[i].compareTo(str[j])==0){
temp = str[i].length();
ch = str[i].charAt(temp/2);
break;
}
}
}
System.out.printf(temp+" "+ch);
}

}
