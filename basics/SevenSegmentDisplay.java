import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.HashMap;

public class Solution {
public static void main(String args[] ) throws Exception {
            
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('0',6);
        map.put('1',2);
        map.put('2',5);
        map.put('3',5);
        map.put('4',4);
        map.put('5',5);
        map.put('6',6);
        map.put('7',3);
        map.put('8',7);
        map.put('9',6);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++) {       //testcase
        String s = br.readLine();       //number
        int sum = 0;

        for(int j=0; j<s.length(); j++) {
        sum += (int)map.get(s.charAt(j));
        }

        int num = sum/2;
        if(sum%2==0) {
        for(int k=0; k<num; k++) {
        System.out.print("1");
        }
        }

        else {
        System.out.print("7");
        for(int k=1; k<num; k++) {
        System.out.print("1");
        }
        }
        System.out.println();
        }

}

}
