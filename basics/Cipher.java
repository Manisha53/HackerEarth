import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
public static void main(String args[] ) throws Exception {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String s = br.readLine();
int ch1 = Integer.parseInt(br.readLine());
char[] arr = s.toCharArray();
for(int i=0; i<s.length(); i++) {

if(arr[i]>='A' && arr[i]<='Z') {
int n = ch1%26;
int bn = (int)(s.charAt(i)+n);
if(bn/(int)'Z'>0 && bn-(int)'Z'!=0) {
bn = (int)'A'+bn%(int)'Z';
bn--;
}
arr[i] = (char)bn;
}

else if(arr[i]>='a' && arr[i]<='z') {
int n = ch1%26;
int bn = (int)(s.charAt(i)+n);
if(bn/(int)'z'>0 && bn-(int)'z'!=0) {
bn = (int)'a'+bn%(int)'z';
bn--;
}
arr[i] = (char)bn;
}

else if(arr[i]>='0' && arr[i]<='9') {
int n = ch1%10;
int bn = (int)(s.charAt(i)+n);
if(bn/(int)'9'>0 && bn-(int)'9'!=0) {
bn = (int)'0'+bn%(int)'9';
bn--;
}
arr[i] = (char)bn;
}
}

for(int i=0; i<arr.length; i++) {
System.out.print(arr[i]);
}
}
}
