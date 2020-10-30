import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Yang on 1/23/20.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return (array == null || array.length == 0) ? null : array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return (array == null || array.length == 0) ? null : array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return (array == null || array.length == 0) ? null : array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return (array == null || array.length == 0) ? null : array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        if (array == null || array.length == 0) return false;
        for (String s : array) if (s.equals(value)) return true;
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        if (array == null || array.length < 2) return array;
        int i = 0, j = array.length - 1;
        while (i < j) {
            String tmp = array[i];
            array[i++] = array[j];
            array[j--] = tmp;
        }
        return array;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        if (array == null || array.length == 0) return false;
        int i = 0, j = array.length - 1;
        while (i < j) if (!array[i++].equals(array[j--])) return false;
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        if (array == null || array.length == 0) return false;
        Set<Character> set = new HashSet<>();
        for (char c = 'a'; c <= 'z'; c++) {
            set.add(c);
        }
        for (String s : array) {
            for (char c : s.toCharArray()) {
                set.remove(Character.toLowerCase(c));
            }
        }
        return set.isEmpty();
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        if (array == null || array.length == 0) return 0;
        int result = 0;
        for (String s : array) if (s.equals(value)) result++;
        return result;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        return Arrays.stream(array).filter(e -> !e.equals(valueToRemove)).toArray(String[] :: new);
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        if (array == null || array.length < 2) return array;
        int i = 1;
        for (int j = 1; j < array.length; j++) {
            if (array[j] != array[i - 1]) {
                array[i++] = array[j];
            }
        }
        String[] result = new String[i];
        for (int j = 0; j < i; j++) result[j] = array[j];
        return result;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        if (array == null || array.length < 2) return array;
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (i != 0 && !array[i].equals(array[i - 1])) {
                result.add(sb.toString());
                sb.delete(0, sb.length());
            }
            sb.append(array[i]);
        }
        result.add(sb.toString());
        return result.toArray(new String[0]);
    }


}
