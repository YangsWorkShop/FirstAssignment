import java.util.Arrays;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by Yang on 1/23/20.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        if(array == null || array.length == 0){ return null;}
        
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        if(array == null || array.length < 2 ){ return null;}
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        if(array == null || array.length == 0 ){ return null;}
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        if(array == null || array.length < 2 ){ return null;}
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        if(array == null || array.length == 0 || value == null){return false;}
        for(String s : array){
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
        if(array == null){ return null;}
        if(array.length < 2){ return array;}
        int l = 0, r = array.length - 1;
        while(l < r){
            swap(array,l++,r--);
        }
        return array;
    }
    
    public static void swap(String[] array, int l, int r){
        if(l == r){return;}
        String temp = array[l];
        array[l] = array[r];
        array[r] = temp;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        if(array == null || array.length == 0 ) return false;
        int l = 0, r = array.length - 1;
        while(l <= r){
            if(!array[l++].equals(array[r--])){
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
        if(array == null || array.length == 0 ) return false;
        int[] alph = new int[26];
        for(String s : array){
            String s_lc = s.toLowerCase();
            for(char c : s_lc.toCharArray()){
                if(c - 'a' < 0 || c - 'a' > 26){
                    continue;
                }
                alph[c - 'a']++;
            }
        }
        
        for(int i = 0; i < alph.length; i++){
            if(alph[i] == 0){
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
        if(array == null || array.length == 0 || value == null){return 0;}
        int res = 0;
        for(String st : array){
            if(st.equals(value)){
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
        if(array == null || array.length == 0 || valueToRemove == null) return array;
        int newLength = 0;
        for(String s : array){
            if(!s.equals(valueToRemove)){
                newLength++;
            }
        }
        
        String[] res = new String[newLength];
        int index = 0;
        for(String s : array){
            if(!s.equals(valueToRemove)){
                res[index++] = s;
            }
        }
        
        return res;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        if(array == null || array.length == 0) return array;
        Deque<String> deque = new ArrayDeque<String>();
        deque.add(array[0]);
        for(String st : array){
            if(!deque.peekLast().equals(st)){
                deque.offerLast(st);
            }
        }
        int l = deque.size();
        String[] res = new String[l];
        int index = 0;
        while(!deque.isEmpty()){
            res[index++] = deque.pollFirst();
        }
        return res;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        if(array == null || array.length == 0) return array;
        List<String> list = new ArrayList<String>();
        int start = 0, end = 0;
        while(end < array.length){
            String s = "";
            while(end < array.length && array[start] == array[end]){
                s += array[start];
                end++;
            }
            list.add(s);
            start = end;
        }
    
        return list.toArray(new String[list.size()]);
    }


}
