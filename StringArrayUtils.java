 

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
        if(array.length == 1){return array[0];}
        else{
        return array[array.length - 2];}
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for(String i : array){
            if (i.equals(value))
            return true;}
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] nw = new String[array.length];
        for (int i = 0; i < array.length; i++){
            nw[array.length - i - 1] = array[i];}
        return nw;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {   
        int i =0;
        int j = array.length - 1;
        if(j == 0)
        return true;
        
        while(i < j){
            if(array[i] != array[j])
            return false;
            i++;
            j--;}
            
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String a = "abcdefghijklmnopqrstuvwxyz";
        for(String e:array){
            for(int j = 0; j < array.length; j++){
                for (int i = 0; i < 26; i++){
                    if(e.charAt(j) == a.charAt(i)){
                        break;}
                    return false;}
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
        int c = 0;
        for(String i:array){
  
            if (i.equals(value)){
                c++;}
            }
        return c;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        int i = 0;
        String[] tmp = new String[array.length];
        for(String k: array){
            if(! k.equals(valueToRemove)){
                
                tmp[i] = k;
                i++;};}
        int j = 0;
        String[] nw = new String[i];
        while(j <i){
            nw[j] = tmp[j];
            j++;}
        return nw;
        
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
