 

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
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) return true;
        }
        
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        int i = 0;
        int j = array.length - 1;
        
        while (i < j) {
            String tmp = array[j];
            array[j] = array[i];
            array[i] = tmp;
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
        int i = 0;
        int j = array.length - 1;
        
        while (i < j) {
            if (array[i] != array[j]) return false;
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
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            String word = array[i];
            for (char c : word.toCharArray()) {
                int x = Character.toUpperCase(c);
                if (x >= 'A' && x <= 'Z') {
                    j |= 1 << (x - 'A');
                }
            }
        }
        
        if (j == (j | ((1 << (1 + 'Z' - 'A')) - 1))) {
            return true;
        }
        
        return false;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int res = 0;
        
        for (int i = 0; i < array.length; i++) {
            String word = array[i];
            if (word == value) res++;
        }
        
        return res;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        int i = 0;
        int j = 0;

        while (i < array.length) {
            if (array[i] != valueToRemove) {
                array[j] = array[i];
                j++;
            }
            i++;
        }
        String[] result = new String[j];

        for (i = 0; i < j; i++) {
            result[i] = array[i];
        }
        return result;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        int i = 0;
        int j = 0;

        while (i < array.length) {
            while ((i < array.length - 1) && array[i] == array[i+1]) {
                i += 1;
            }
            array[j] = array[i];
            j += 1;
            i += 1;
        }
        String[] result = new String[j];

        for (i = 0; i < j; i++) {
            result[i] = array[i];
        }
        
        return result;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        int i = 0;
        int j = 0;
        String tmp = "";
        String prev = "";
        
        while (i < array.length) {
            System.out.println(array);
            if (i == 0) {
                tmp += array[i];
                prev = array[i];
                i++;
            } else {
                if (prev == array[i]) {
                    tmp += array[i];
                    i++;
                } else {
                    array[j] = tmp;
                    j++;
                    tmp = array[i];
                    prev = array[i];
                    i++;
                }
            }
        }
        
        String[] result = new String[j+1];

        for (i = 0; i < j; i++) {
            result[i] = array[i];
        }
        result[j] = tmp;
        
        return result;
    }
}
