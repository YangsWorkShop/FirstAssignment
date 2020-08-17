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
        return array[(array.length-1)];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[(array.length-2)];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        boolean count = false;
        for(int i=0;i<array.length;i++){
            if(array[i] == value){
                count = true;
                
            }
            else {
                count = false;
                
            }
            
            
        }
        return count;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] placeHolder = new String[array.length];
        int j = array.length;
        for(int i = 0; i<array.length;i++){
            placeHolder[j-1] = array[i];
            j--;
        }
        
        return placeHolder;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String[] checkArray = StringArrayUtils.reverse(array);
        boolean check = false;
        if(Arrays.equals(array,checkArray)){
            check = true;
            
        }
        return check;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String sentence = Arrays.toString(array);
        boolean[] alphabet = new boolean[26];
        int index = 0;
        boolean answer = true;
        
       for (int i = 0; i < sentence.length(); i++) { 
         if ( sentence.charAt(i) >= 'A' && sentence.charAt(i) <= 'Z') {
            index = sentence.charAt(i) - 'A'; 
         }else if( sentence.charAt(i) >= 'a' &&  sentence.charAt(i) <= 'z') {
            index = sentence.charAt(i) - 'a'; 
         }
         alphabet[index] = true; 
      }
      
      for (int i = 0; i <= 25; i++) {
         if (alphabet[i] == false) 
            answer = false;
      }
        
        
        
        
        return answer;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;
        for(int i=0;i<array.length;i++){
            if(array[i] == value){
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
        String[] answer = new String[array.length - 1]; 
        for (int i = 0, k = 0; i < array.length; i++) { 
            if (array[i] == valueToRemove) { 
                continue; 
            } 

            answer[k++] = array[i]; 
        }
        
        return answer;
    }

     
    
    
    
    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        int j = 0;
        
        for(int i=0;i<array.length;i++){
            if(array[j] != array[i]){
                j++;
                array[j] = array[i];
                
            }
            
        }
        return Arrays.copyOfRange(array, 0, j+1);
  
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return null;
    }


}
