 
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
        return array==null?null:array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array==null||array.length<1?null:array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array==null?null:array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array==null||array.length==1?null:array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for(String str:array){
            if(str.equals(value)) return true;
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        if(array==null) return null;
        int i=0,j=array.length-1;
        while(i<j){
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
        if(array==null) return true;
        int i=0,j=array.length-1;
        while(i<j){
            if(!array[i].equals(array[j])) return false;
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
        Set<Character> set = new HashSet();
        for(int i=0;i<26;i++){
            set.add((char)('a'+i));
        }
        for(String str:array){
            str = str.toLowerCase();
            for(int i=0;i<str.length();i++)
                if(set.contains(str.charAt(i))){
                    set.remove(str.charAt(i));
                }
        }
        return set.isEmpty()?true:false;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;
        if(array==null) return count;
        for(String str:array){
            if(str.equals(value)) count++;
        }
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        if (array==null) return null;
        int deleteIndex = -1;
        for(int i=0;i<array.length;i++){
            if(array[i].equals(valueToRemove)){
                deleteIndex = i;
                break;
            }
        }
        while(deleteIndex!=-1&&deleteIndex<array.length-1){
            array[deleteIndex] = array[deleteIndex+1];
            deleteIndex++;
        }
        return Arrays.copyOfRange(array,0,array.length-1);
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        if(array==null) return null;
        int i=0;
        for(int j=0;j<array.length;j++){
            if(!array[j].equals(array[i])){
                array[++i] = array[j];
            }
        }
        return Arrays.copyOfRange(array,0,i+1);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        if(array==null) return null;
        int i =0;
        String before=array[0];
        StringBuilder sb = new StringBuilder();
        for(int j=0;j<array.length;j++){
            
            if(!array[j].equals(before)){
                before = array[j];
                array[i++] = sb.toString();
                sb.setLength(0);
            }
            sb.append(array[j]);
        }
        array[i++] = sb.toString();
        return Arrays.copyOfRange(array,0,i);
    }


}
