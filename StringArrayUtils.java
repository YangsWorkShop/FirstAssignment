 

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
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (String i : array) {
            if (i == value) {
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
        String[] reversed = new String[array.length];
        for(var i = 0; i < array.length; i++) {
           reversed[i] = array[array.length - i - 1]; 
        }
        return reversed;    
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String[] reversed = reverse(array);
        for (var i = 0; i < array.length; i++) 
            if (array[i] != reversed[i]) 
                return false;
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        int[] count = new int [26];
        int i = 0;
        for (String word : array){
            for ( i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                c = Character.toLowerCase(c);
                if (c >='a' && c <='z'){
                    count[c - 'a'] += 1;
                }
            }
        }
        for ( i = 0; i < count.length; i++) {
            if (count[i] == 0) 
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
        int count = 0;
        for (String word : array) 
            if (word == value) 
                count += 1;
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        int index = -1;
        String[] newArray = new String[array.length-1];
        for(var i = 0; i < array.length; i++ )
            if (array[i] == valueToRemove){
                index = i;
                break;
            }
        for(var i = index; i < array.length - 1; i++ )
            array[i] = array[i + 1];
        for(var i = 0; i < array.length - 1; i++ )
            newArray[i] = array[i];    
        
               
        return newArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        int i = 0;
        int j = 0;
        int curLen = 0;
        while (i < array.length - 1) {
            if (array[i] == "0") {
                break;
            }
            if (array[i].equals(array[i + 1]) ){
                for(j = i; j < array.length - 1; j++) 
                    array[j] = array[j + 1];
                array[j] = "0";
                curLen += 1;
            }
            else {
                i += 1;
            }
        }
        String[] newArray = new String[array.length-curLen];
        System.out.println(newArray.length);
        for(j = 0; j < newArray.length; j++ )
            newArray[j] = array[j]; 
        return newArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        String sub = "";
        String prev = "";
        String[] result = new String [array.length];
        int i = 0;
        for (String ele: array) {
            if (prev.equals(ele)) {
                sub = sub.concat(ele);
            }
            else if (sub != "") {
                result[i++] = sub;
                sub = "";
                sub = sub.concat(ele);
            }
            else {
                sub = sub.concat(ele);
                
            }
            prev = ele;
        }
        result[i] = sub;
        int index = 0;
        for(i = 0; i < result.length; i++ )
            if (result[i] == null){
                index = i;
                break;
            }
        String[] resultFinal = new String [i];
        for (i = 0; i < resultFinal.length; i++)
            resultFinal[i] = result[i];
        return resultFinal;
         
    }
}
