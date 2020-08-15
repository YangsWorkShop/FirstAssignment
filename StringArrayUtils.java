import java.util.List;
import java.util.ArrayList;

/**
 * Created by Yang on 1/23/20.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        if(array == null || array.length== 0) {
            return null;
        }
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        if(array == null || array.length== 0) {
            return null;
        }
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        if(array == null || array.length== 0) {
            return null;
        }
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        if(array == null || array.length== 0) {
            return null;
        }
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        if(array == null || value == null) {
            return false;
        }
        
        for(int i = 0; i < array.length; i++) {
            if(array[i].equals(value)) {
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
        if(array == null) {
            return array;
        }
        int l = 0;
        int r = array.length - 1;
        while(l < r){
            String temp = array[r];
            String last = array[l];
            array[r] = array[l];
            array[l] = temp;
            r--;
            l++;
        }
        return array;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO  xuyaopanduanlength??
    public static boolean isPalindromic(String[] array) {
        if(array == null || array.length == 0) {
            return true;
        }
        int l = 0;
        int r = array.length - 1;
        while(l < r) {
            if(array[r].equals(array[l])) {
                l++;
                r--;
            } else {
                return false;
            }
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        if (array == null || array.length == 0) {
            return false;
        }
        
        int[] letters = new int[26];
        for (String word : array) {
            char[] chs = word.toCharArray();
            for (char ch : chs) {
                if (Character.isLetter(ch)) {
                    letters[Character.toLowerCase(ch) - 'a'] = 1;
                }
            }
        }
        
        for (int letter : letters) {
            if (letter == 0) {
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
        if(array == null) {
            return 0;
        }
        int count = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i].equals(value)) {
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
        if(array == null || array.length == 0) {
            return array;
        }
        
        List<String> result = new ArrayList<>();
        for (String word : array) {
            if (!valueToRemove.equals(word)) {
                result.add(word);
            }
        }
        return result.toArray(new String[0]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        if(array == null || array.length == 0) {
            return array;
        }
        
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < array.length) {
            result.add(array[i++]);
            while (i < array.length && array[i].equals(array[i - 1])) {
                i++;
            }
        }
        return result.toArray(new String[0]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        if(array == null || array.length == 0) {
            return array;
        }
        
        List<String> result = new ArrayList<>();
        StringBuilder sb = null;
        int i = 0;
        while (i < array.length) {
            sb = new StringBuilder();
            sb.append(array[i++]);
            while (i < array.length && array[i].equals(array[i - 1])) {
                sb.append(array[i]);
                i++;
            }
            result.add(sb.toString());
        }
        return result.toArray(new String[0]);
    }


}
