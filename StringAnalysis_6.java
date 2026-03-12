import java.util.*;

public class StringAnalysis_6 {
    public static void main(String[] args) {

        String str = "programming";

        if(str == null || str.length() == 0) {
            System.out.println("Invalid Input");
            return;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency
        for(char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Find first non-repeating character
        Character firstNonRepeat = null;
        for(char c : str.toCharArray()) {
            if(map.get(c) == 1) {
                firstNonRepeat = c;
                break;
            }
        }

        // Find most repeating character
        char mostRepeat = str.charAt(0);
        int max = 0;

        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue() > max) {
                max = entry.getValue();
                mostRepeat = entry.getKey();
            }
        }

        // Output
        if(firstNonRepeat == null) {
            System.out.println("None " + mostRepeat);
        } else {
            System.out.println(firstNonRepeat + " " + mostRepeat);
        }
    }
}