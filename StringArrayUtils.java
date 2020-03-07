
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
        int index = array.length;
        return array[index - 1];
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
        for (var i = 0; i < array.length; i++) {
            if (value == array[i]) {
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

        String[] newarray = new String[array.length];

        for (int i = array.length - 1; i >= 0; i--) {
            newarray[i] = array[array.length - i - 1];
        }
        return newarray;
        // char[] charArr = array.toCharArray();
        // List<Character> CharList = new ArrayList<>();

        // for(char c: charArr)
        // CharList.add(c);

        // Collections.reverse(CharList);
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {

        int i1 = 0;
        int i2 = array.length - 1;

        while (i2 > i1) {
            if (array[i2] != array[i1]) {
                return false;
            }

            i1++;
            i2--;
        }
        return true;

    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        boolean[] mark = new boolean[26];
        int index = 0;

        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array[j].length(); i++) {
                char cur = array[j].charAt(i);
                if (array[j].charAt(i) >= 'A' && array[j].charAt(i) <= 'Z') {
                    index = cur - 'A';
                } else if (array[j].charAt(i) >= 'a' && array[j].charAt(i) <= 'z') {
                    index = cur - 'a';
                }
                mark[index] = true;
            }
        }

        for (int i = 0; i < mark.length; i++) {
            if (mark[i] != true) {
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
        // for (int x : array)
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
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

        // cnt -> array.length - cnt
        // ret[cnt] = array[i]
        // cnt++

        int cnt = 0;
        for (var i = 0; i < array.length; i++) {
            if (valueToRemove == array[i]) {
                cnt++;
            }

        }
        String[] ret = new String[array.length - cnt];
        cnt = 0;
        for (var i = 0; i < array.length; i++) {

            if (array[i] != valueToRemove) {
                ret[cnt] = array[i];
                cnt++;
            }
        }
        return ret;

    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        if (array.length == 0) {
            return array;
        }
        int count = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) {
                count++;
            }
        }
        String[] str = new String[count];
        str[0] = array[0];
        int ccount = 1;
        //
        for (int i = 1; i < array.length; i++) {

            if (array[i - 1] != array[i]) {
                str[ccount] = array[i];
                ccount++;
            }

        }
        // System.out.println(Arrays.toString(str));
        return str;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence
     *         concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        // no. of ele
        if (array.length == 0)
            return array;
        int count = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) {
                count++;
            }
        }
        String[] arr = new String[count];
        int newc = 0;
        arr[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) {
                newc++;
                // a a b
                arr[newc] = new String(array[i]);
            } else {
                arr[newc] = arr[newc] + array[i];
            }

        }
        return arr;
    }

}
