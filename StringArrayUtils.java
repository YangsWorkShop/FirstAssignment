 import java.util.*;

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
        for(String s: array){
            if(s.equals(value)){
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
        String[] res = new String[array.length];
        for(int i = array.length - 1; i > -1; i--){
            res[array.length - 1 - i] = array[i];
        }
        return res;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        int i = 0, j = array.length - 1;
        while(j >= i){
            if(!array[i].equals(array[j])){
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
        Set chars = new HashSet();
        for(String s: array){
            s = s.toLowerCase();
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) != ' '){
                     chars.add(s.charAt(i));
                }
            }
        }
        if(chars.size() == 26){
            return true;
        }
        return false;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int res = 0;
        for(String s: array){
            if(s.equals(value)){
                res += 1;
            }
        }
        return res;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList<String> res = new ArrayList<String>();
        for(String s: array){
            if(!s.equals(valueToRemove)){
                res.add(s);
            }
        }
        return (String[]) res.toArray(new String[0]);
    }   

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        String currentString = "";
        ArrayList<String> res = new ArrayList<String>();
        for(String s: array){
            if(!s.equals(currentString)){
                res.add(s);
                currentString = s;
            }
        }
        return (String[]) res.toArray(new String[0]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        ArrayList<String> res = new ArrayList<String>();
        String duplicate = array[0];
        for(int idx = 1; idx < array.length; idx++){
            if(array[idx].equals(array[idx - 1])){
                duplicate += array[idx];
            }else{
                res.add(duplicate);
                duplicate = array[idx];
            }
        }
        res.add(duplicate);
        return (String[]) res.toArray(new String[0]);
    }


}
