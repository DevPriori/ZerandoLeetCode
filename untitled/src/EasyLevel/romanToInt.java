package EasyLevel;

import java.util.HashMap;
import java.util.Map;

public class romanToInt {
    public static void main(String[] args) {
        System.out.println(romanToInt("iii"));
    }
    private static int romanToInt(String s){
        s = s.toUpperCase();
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I',1);
        romanMap.put('V',5);
        romanMap.put('X',10);
        romanMap.put('L',50);
        romanMap.put('C',100);
        romanMap.put('D',500);
        romanMap.put('M',1000);


        int total = 0;
        int prevVal = 0;

        for(int i = s.length() -1; i >= 0 ; i--){
            char c = s.charAt(i);
            int current = romanMap.get(c);

            if(current < prevVal){
                total -= current;
            }else{
                total += current;
            }
            prevVal = current;

        }
        return total;
    }
}
