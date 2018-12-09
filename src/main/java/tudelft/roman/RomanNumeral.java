package tudelft.roman;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeral {

    private static Map<Character, Integer> map;

    static {
        map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }

    public int convert(String s) {

        if(s == null) {
            return -1;
        }

        int convertedNumber = 0;
        for(int i = 0; i < s.length(); i++) {
            if(!map.containsKey(Character.toUpperCase(s.charAt(i)))) {
//                System.out.println("Not a valid roman numeral");
                return -1;
            }

            int currentNumber = map.get(Character.toUpperCase(s.charAt(i)));
            int next = i+1 < s.length() ? map.get(s.charAt(i+1)) : 0;

            if(currentNumber >= next)
                convertedNumber += currentNumber;
            else
                convertedNumber -= currentNumber;
        }

        return convertedNumber;

    }
}
