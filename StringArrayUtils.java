 

/**
 * Created by Yang on 1/23/20.
 */
import java.util.*;
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        if (array.length == 0) return null;
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        if (array.length < 1) return null;
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        if (array.length == 0) return null;
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        if (array.length < 2) return null;
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        if (array.length == 0 || value == null) return false;
        for(String i : array){
            if (i == value) return true;
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        if (array.length == 0) return null;
        String[] result = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[array.length - 1 - i];
        }
        return result;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        if (array.length == 0) return false;
        int i = 0, j = array.length - 1;
        while (i < j) {
            if (array[i] != array[j])
                return false;
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
        if (array.length == 0) return false;
        String result = "";
        int index = 0;
        boolean [] check = new boolean[26];
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        
        for (int i = 0; i < result.length(); i++) {
            if ('A' <= result.charAt(i) && result.charAt(i) <= 'Z')
                index = result.charAt(i) - 'A';
            else if ('a' <= result.charAt(i) && result.charAt(i) <= 'z')
                index = result.charAt(i) - 'a';
            else
                continue;
            check[index] = true;
        }
        
        for (int i = 0; i <= 25; i++) {
            if (check[i] == false) return false;
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int result = 0;
        int valIndex = value.length();
        if (array.length == 0 || value == null) return result;
        for(String element : array) {
            int eleIndex = element.length();
            int eleStart = 0, valStart = 0;
            if (eleIndex < valIndex) continue;
            while(valIndex > valStart && eleIndex > eleStart) {
                if (element.charAt(eleStart) == value.charAt(valStart)){
                    eleStart++;
                    valStart++;
                }
                else {
                    eleStart++;
                    valStart = 0;
                }
            }
            if (valStart == valIndex) result += 1;
        }
        return result;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        if (array.length == 0 || valueToRemove == null) return array;
        String[] result = new String [array.length - 1];
        int start = 0;
        for(int i = 0; i < array.length; i++){
            if (array[i].equals(valueToRemove)){
                result[start++] = array[i+1];
                i = i + 1;
            } else {
                result[start++] = array[i];
            }
        }
        return result;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        if (array.length == 0) return null;
        int start = 0;
        String [] result = new String[array.length];
        for(int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i+1]){
                result[start++] = array[i];
            }
        }
        result[start++] = array[array.length-1];
        String [] finalResult = new String[start];
        for(int i = 0; i < start; i++) {
           finalResult[i] = result[i];
        }
        return finalResult;
    }
    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        if (array.length == 0) return null;
       List<String> result = new ArrayList<String>();
        int index = 0;
        result.add(array[0]);
        for (int i = 0;i < array.length-1; i++){
            if (array[i].equals(array[i+1])){
                result.set(index,result.get(index)+array[i+1]);
            }else{
                result.add(array[i+1]);
                index++;
            }
        }
        String[] finalArray = new String[result.size()];
        result.toArray(finalArray);
        return finalArray;
    }


}
