import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Yang on 1/23/20.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];

        
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                return true;
            } 
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            String temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
        return array;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            if (!array[i].equals(array[j])) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
     public static boolean isPangramic(String[] array) {
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            map.put((char)('a' + i), 0);
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length(); j++) {
                char temp = Character.toLowerCase(array[i].charAt(j));
                if (temp != ' ') {
                    Integer count = map.get(temp);
                    map.put(temp, count + 1);
                }
            }
        }
        //loop hashmap
        for (Integer v : map.values()) {
            if (v == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                count++;
            } 

        }
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (!array[i].equals(valueToRemove)) {
                list.add(array[i]);
            }
        }
        String[] result = new String[list.size()];
        for (int j = 0; j < list.size(); j++) {
            result[j] = list.get(j);
        }
        return result;       
            
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        List<String> list = new ArrayList<>();
        int fast = 0;
        int slow = 0;
        list.add(array[slow]);
        while (fast < array.length) {
            if (array[fast].equals(array[slow])) {
                fast++;
            } else {
                list.add(array[fast]);
                slow = fast;
                fast++;
            }
        }
        String[] result = new String[list.size()];
        for (int j = 0; j < list.size(); j++) {
            result[j] = list.get(j);
        }
        return result;     
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
     public static String[] packConsecutiveDuplicates(String[] array) {
        List<String> list = new ArrayList<>();
        int fast = 1;
        int slow = 0;
        while (fast < array.length) {
            if (array[fast] == array[slow]) {
                fast++;
            } else {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < fast - slow; i++) {
                    sb.append(array[slow]);
                }
                list.add(sb.toString());
                slow = fast;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < fast - slow; i++) {
            sb.append(array[slow]);
        }
        list.add(sb.toString());
        String[] result = new String[list.size()];
        for (int j = 0; j < list.size(); j++) {
            result[j] = list.get(j);
        }
        return result;
    }


}
