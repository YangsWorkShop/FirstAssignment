import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.lang.String;
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
        return Arrays.asList(array).contains(value);
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] reverseArray = new String[array.length];
        int index=0;
        for(int i=array.length-1;i>=0;--i){
            reverseArray[index++]=array[i];
        }
        return reverseArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String[] reverseArray = new String[array.length];
        int index=0;
        for(int i=array.length-1;i>=0;--i){
            reverseArray[index++]=array[i];
        }
        if(Arrays.equals(array,reverseArray))
            return true;
        return false;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        boolean[] alphabetCheck= new boolean[26];
        for(String s:array){
            int index=0;
            char[] chars = s.toCharArray();
            for(char c:chars){
                if ('A' <= c && c <= 'Z')
                    index = c - 'A';
                else if ('a' <= c && c <= 'z')
                    index = c - 'a';
                else
                    continue;
                alphabetCheck[index]=true;
            }

        }
        for (int i = 0; i <= 25; i++)
            if (alphabetCheck[i] == false)
                return false;
        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(String s:array){
            if(map.containsKey(s))
                map.put(s,map.get(s)+1);
            else
                map.put(s,1);
        }
        return map.get(value);
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        List<String> removedList = new ArrayList<String>(Arrays.asList(array));
        removedList.remove(valueToRemove);
        return removedList.toArray(new String[0]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        int index=1;
        for(int i=1;i<array.length;i++){
            if(array[i]!=array[index-1])
                array[index++] = array[i];
        }
        String[] ans=new String[index];
        for(int i=0;i<index;i++)
            ans[i]=array[i];
        return ans;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {

        String tmp=array[0];
        List<String> list=new ArrayList<String>();
        for(int i=1;i<array.length;i++){

            if(array[i]!=array[i-1]){
                list.add(tmp);
                tmp=array[i];
            }
            else
                tmp+=array[i];

        }
        list.add(tmp);
        String[] ans = list.toArray(new String[list.size()]);
        return ans;
    }


}
