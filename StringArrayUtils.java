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
        if (array != null && array.length > 0)
            return array[0];
        return null;    
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        if (array != null && array.length > 1)
            return array[1];
        return null;    
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        if (array != null && array.length > 0)
            return array[array.length-1];
        return null;
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        if (array != null && array.length > 1)
            return array[array.length-2];
        return null;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for(int i=0;i<array.length;i++){
            if(array[i].equals(value))
                return true;
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        for(int i = 0; i < array.length / 2; i++){
            String temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        int flag = 0;
        for(int i = 0; i <= array.length / 2; i++){
            if(array[i].equals(array[array.length - i - 1]))
                continue;
            else    
                flag=1;
        }
        if(flag==1)
            return false;
        else
            return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        int[] flag = new int[26];
        int idx=0;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length();j++){
                if(array[i].charAt(j)>='A' && array[i].charAt(j)<='Z'){
                    idx = array[i].charAt(j)-'A';
                }
                else if(array[i].charAt(j)>='a' && array[i].charAt(j)<='z') {
                    idx = array[i].charAt(j)-'a'; 
                }
                else
                    continue;  
                flag[idx]=1;    
            }
        }
        for(int i = 0; i < 26; i++){
            if (flag[i] == 0) 
                return false;
        }
             
        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count=0;
        for(int i=0;i<array.length;i++){
            if(array[i].contains(value))
                count++;
        }
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        /*int count=0;
        for(int i=0;i<array.length;i++){
            if(array[i].contains(valueToRemove))
                count++;
        }
        String[] result = new String[array.length - count];
        int c = 0;
        for(String str : array){
            if(!str.equals(valueToRemove)){
                result[c++] = str;
            }
        }
        return result;*/
        List<String> result = new ArrayList<>();
        for (String str : array) {
            if (!valueToRemove.equals(str)) {
                result.add(str);
            }
        }
        return result.toArray(new String[0]);
    }
    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        
        List<String> result = new ArrayList<>();
        int i=0;
        result.add(array[i]);
        for(int j=1;j<array.length;j++){
            if(array[j].equals(array[i])){
                continue;
            }
            else{
                result.add(array[j]);
                i=j;
            }
        }  
        return result.toArray(new String[0]);
        
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        List<String> result = new ArrayList<>();
        int i=0;
        StringBuilder sb = new StringBuilder();
        sb.append(array[0]);
        for(int j=1;j<array.length;j++){
            while(j<array.length && array[j].equals(array[i])){
                sb.append(array[j]);
                j++;
                i++;
            }
            result.add(sb.toString());
            
            if(j<array.length){
                sb = new StringBuilder();
                sb.append(array[j]);
                i=j;
            }
            if(j==array.length-1)
                result.add(sb.toString());
            
        }  
       
        return result.toArray(new String[0]);
    }


}
