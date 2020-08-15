 
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
        for (String element : array) {
        if (element == value) return true;
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] newArray = new String[array.length];

        for(int i = array.length-1; i >= 0; i--) {

                newArray[newArray.length-1-i] = array[i];
            }

        return newArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        int midIndex = (int)Math.ceil(array.length/2);
        int i = 0;
        while (i < midIndex) {
            int j = array.length-1;
        if(array[i++] == array[j--]) return true;
        }
        return false;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        StringBuilder sb = new StringBuilder();
        
        for (String element : array) { sb.append(element);}
        
        char[] charArr = sb.toString().toLowerCase().toCharArray();
        
        LinkedHashSet<Character> set = new LinkedHashSet();
        
        for (char c : charArr) { set.add(c);}
        
        for (char alphabet = 'a'; alphabet <= 'z'; alphabet++) {
        if (!set.contains(alphabet)) return false;
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
        for (String element: array) {
        if(value == element) count++;}
        
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
       ArrayList<String> list = new ArrayList<>(Arrays.asList(array));
       
       list.removeAll(Collections.singleton(valueToRemove));
       
       String[] newArr = new String[list.size()];
       return list.toArray(newArr);
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
   ArrayList<String> list=new ArrayList();
        int i = 1;
        list.add(array[0]);

        while( i < array.length) {
            if (array[i] != array[i-1]) list.add(array[i]);
            i++;
        }

        String[] newArray = new String[list.size()];
        return list.toArray(newArray);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        ArrayList<String> list = new ArrayList();
        
        list.add(array[0]);
        
        int i = 1;
        
        while (i < array.length) {
            if(array[i-1] == array [i]) {
            int index = list.size() - 1;
            String element = list.get(index) + array[i];
            list.set(index, element);
            } else list.add(array[i]);
            
            i++;
        }
        String[] newArr = new String[list.size()];
        return list.toArray(newArr);       
    }


}
