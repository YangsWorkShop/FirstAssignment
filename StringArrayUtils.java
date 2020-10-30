 

/**
 * Created by Yang on 1/23/20.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        if (array.length > 0){
            return array[0];
        }
        else{
            return null;
        }
        
        
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        if (array.length > 0){
            return array[1];
        }
        else{
            return null;
        }
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        if (array.length > 0){
            return array[array.length-1];
        }
        else{
            return null;
        }
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        if (array.length > 0){
            return array[array.length-2];
        }
        else{
            return null;
        }
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for(String item : array){
            if (value == item){return true;}
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] res = new String[array.length];
        for(int i = 0; i < array.length; i++){
            res[array.length-1-i] = array[i];
        }
        return res;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        int i = 0;
        int j = array.length-1;
        while( i < j){
            if (array[i] != array[j]){
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
        boolean[] checked = new boolean[26];
        for(String item : array){
            int strLen = item.length();
            for(int i = 0; i < strLen; i++){
                char a = item.charAt(i);
                if(a >= 'A' && a <= 'Z'){
                    checked[a-'A'] = true;
                }
                else if (a >= 'a' && a <= 'z'){
                    checked[a-'a'] = true;
                }
            }
        }
        
        for(int i = 0; i < 26; i++){
            if(checked[i] == false){
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
        int res = 0;
        for(String str : array){
            if(str == value){
                res++;
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
        String[] res = new String[array.length-1];
        int i = 0;
        for(String str : array){
            if(str != valueToRemove){
                res[i++] = str;
            }
        }
        return res;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return null;
    }
}
