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
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for(int i = 0; i < array.length; i++ ){
            if(array[i].equals(value)){
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
        for(int i = 0; i < array.length; i++){
            res[i] = array[array.length-1-i];
        }
        return res;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        int left = 0;
        int right = array.length-1;
        while(left<right){
            if(!array[left].equals(array[right])){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        Set<Character> charSet = new HashSet<Character>();
        for(int i = 0; i < array.length; i++){
            String lowercase = array[i].toLowerCase();
            for(int j = 0; j < lowercase.length(); j++){
                if(lowercase.charAt(j) >= 'a' && lowercase.charAt(j) <= 'z'){
                    charSet.add(lowercase.charAt(j));
                }
            }
        }
        
        return charSet.size() == 26;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i].equals(value)){
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
        ArrayList<String> stringList = new ArrayList<String>();
        for(String s: array){
            if(!s.equals(valueToRemove)){
                stringList.add(s);
            }
        }
        
        String[] res = new String[stringList.size()];
        int i = 0;
        for(String s: stringList){
            res[i++] = s;
        }
        return res;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> stringList = new ArrayList<String>();
        stringList.add(array[0]);
        for(int i = 1; i < array.length; i++){
            if(!array[i].equals(stringList.get(stringList.size()-1))){
                stringList.add(array[i]);
            }
        }
        String[] res = new String[stringList.size()];
        int i = 0;
        for(String s: stringList){
            res[i++] = s;
        }
        return res;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        
        ArrayList<String> stringList = new ArrayList<String>();
        
        int i = 0;
        
        while( i < array.length - 1){
            
            if(array[i].equals(array[i+1])){
                String duplicate = array[i];
                
                StringBuilder sb = new StringBuilder();
                
                while(i < array.length && array[i].equals(duplicate)){
                    sb.append(array[i]);
                    i++;
                }
                stringList.add(sb.toString());
            }else{
                stringList.add(array[i]);
                i++;
            }
            
        }
        if( i < array.length){
            stringList.add(array[i]);
        }
        
        String[] res = new String[stringList.size()];
        i = 0;
        for(String s: stringList){
            res[i++] = s;
        }
        
        return res;
    }


}
