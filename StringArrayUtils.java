import java.util.ArrayList;

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
        for (String s : array) {
            if (s.equals(value)) {
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
        
        String[] result = array;
        int i = 0;
        int j = array.length - 1;

        while(i < j) {
            String temp = result[i];
            result[i] = result[j];
            result[j] = temp;
            i = i + 1;
            j = j - 1;
        }

        return result;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        
        int i = 0;
        int j = array.length - 1;

        while(i < j) {
            int size1 = array[i].length();
            int size2 = array[j].length();
            if (size1 != size2) return false;
            if (!array[i].equals(array[j])) {
                return false;
            }
            i = i + 1;
            j = j - 1;
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        boolean[] alphabet = new boolean[26];

        int index = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length(); j++) {
                if (array[i].charAt(j) == 32) continue;
                index = array[i].toLowerCase().charAt(j) - 'a';
                alphabet[index] = true;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (alphabet[i] == false) {
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
        int count = 0;
        for (String s : array) {
            if (s.equals(value)) {
                count = count + 1;
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
        String[] result = {};
        ArrayList<String> arraylist = new ArrayList<>();
        for (String s : array) {
            arraylist.add(s);
        }
        arraylist.remove(valueToRemove);
        result = arraylist.toArray(result); // toArray(T[] array) otherwise toArray() returns a Object[]
        return result;                      // convert arraylist to array could also use get() method
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        String[] result = {};
        ArrayList<String> arraylist = new ArrayList<>();
        arraylist.add(array[0]);
        for (int i = 1; i < array.length; i++) {
            if (!array[i-1].equals(array[i])) {
                arraylist.add(array[i]);
            }
        }
        result = arraylist.toArray(result);
        return result;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        String[] result = {};
        ArrayList<String> arraylist = new ArrayList<>();
        arraylist.add(array[0]);
        
        for (int i = 1; i < array.length; i++) {
            if (array[i-1].equals(array[i])) {
                arraylist.set(arraylist.size()-1, arraylist.get(arraylist.size()-1) + array[i]);
            } else {
                arraylist.add(array[i]);
            }
        }
        result = arraylist.toArray(result);
        return result;
    }


}
