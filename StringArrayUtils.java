import java.util.Arrays;

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
        for (String element : array) {
            if (value.equals(element)) {
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

        String[] reverse = new String[array.length];

        for (int i = 0; i < array.length; i++) {
            reverse[i] = new StringBuilder(array[i]).reverse().toString();
        }
        return reverse;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {

        String[] original = Arrays.copyOf(array, array.length);

        for (int i = 0; i < array.length / 2; i++) {
            String temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }

        return Arrays.equals(array, original);
    } // Could only get this to pass the first test, couldn't figure out why in time

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {

        if (array == null) {
            return false;
        }

        for (int i = 0; i < array.length; i++) {
            char c = array[i].charAt(i);
            if (!(c >= 'A' && c <= 'Z') && !(c >= 'a' && c <= 'z')) {
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
        int res = 0;
        for (int i = 0; i < array.length; i++)
            if (value == array[i]) {
                res++;
            }
        return res;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {

        int index = 0;

        for (int i = 0; i < valueToRemove.length(); i++) {

            int j;
            for (j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    break;
                }
            }

            if (j == i) {
                array[index++] = array[i];
            }
        }
        return Arrays.copyOf(array, index);
    }// Couldn't figure out another way to do this

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        int n = array.length;

        int j = 0;
        for (int i = 1; i < n; i++) {
            if (array[j] != array[i]) {
                j++;
                array[j] = array[i];
            }
        }

        return Arrays.copyOfRange(array, 0, j + 1);
    }// I think this didn't work because of a String to Char conversion problem

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence
     *         concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < array.length; i++) {

            if (i < array.length) {
                result.append(array[i].charAt(i));
            }
        }
        return result.toString(); // This created problems with compilation

    }

}
