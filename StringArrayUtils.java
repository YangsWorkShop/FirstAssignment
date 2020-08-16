 

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
        for (int i =0; i < array.length; i++){
            if (array[i] == value){
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
        
        
        for (int i =0; i < array.length/2; i++){
            String temp = array[i];
            array[i] = array[array.length -i -1];
            array[array.length -i -1] = temp;
        }
        return array;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards 
     * and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        int i =0, j = array.length-1;
        
        while(i < j){
            if(array[i] ==array[j]){
                return true;
            }
            i++;
            j--;
        }
        return false;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        StringBuilder str_arr = new StringBuilder();
        for(int i =0; i < array.length; i++){
            str_arr.append(array[i]);
        }
        
        int index = 0;
        
        boolean[] letter = new boolean[26];
        
        for(int i =0; i < str_arr.length(); i++){
            if('A' <=str_arr.charAt(i) && str_arr.charAt(i) <= 'Z'){
                index = str_arr.charAt(i) -'A';
            }
            else if('a' <=str_arr.charAt(i) && str_arr.charAt(i) <= 'z'){
                index = str_arr.charAt(i) -'a';
                
            }
            
            else
                continue;
            letter[index] = true;
            
        }
        
        for(int i =0; i <=25; i++){
            if(letter[i]== false){
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
        int count =0;
        
        for(int i =0; i<array.length; i++){
            if(array[i] == value){
                count++;
            }
            else{
                continue;
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
        String [] new_arr = new String[array.length -1];
        for(int i =0, k=0; i<array.length; i++){
            if(array[i]== valueToRemove){
                continue;
            }
            new_arr[k++]= array[i] ;
        }
        return new_arr;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        int n = array.length; 
 
        int j = 0; 
        for (int i = 1; i < n; i++)  
        {
            if (array[j] != array[i]) 
            { 
                j++; 
                array[j] = array[i]; 
            } 
        } 
        
        int start = 0,end = j+1;
        String [] slice = new String[end -start+1];
        
        for(int k=0; k< slice.length; k++){
            slice[k] = array[start + k];
        }
        
        return slice;
        
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate 
     * occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        String s ="";
        for(int i = 0; i < array.length; i++) {
            if (array[i] == array[i+1])
                s = s + array[i];
                i =i+2;
                if (i < array.length-1)
                    s = s + " ";
            }
        return null;
        
    }


}
