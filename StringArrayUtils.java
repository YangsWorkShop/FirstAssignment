
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
        for (int i=0; i < array.length; i++){
            if (array[i].equals(value)){
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
        int l = array.length;
        for (int j = 0; j < l / 2; j++)
        {
            String temp = array[j];
            array[j] = array[l - j - 1];
            array[l - j - 1] = temp;
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
            if (array[i] == array[j]) {
                i++;
                j--;
            }
            else return false;
        }
        return true;
    }


    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        boolean pangramic = true;
        for (int i = 0; i < alphabet.length(); i++){
            boolean check = false;

            for (int j = 0; j < array.length; j++){

                if(array[j].toLowerCase().contains(Character.toString(alphabet.charAt(i)))){
                    check = true;
                    break;
                }
            }
            if (!check){
                pangramic = false;
                break;
            }

        }
        return pangramic;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int number = 0;
        for ( int i = 0; i < array.length; i++){
            if (array[i] == value){
                number++;
            }
        }
        return number;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        int k = 0;
        int occ = getNumberOfOccurrences(array, valueToRemove);

        String[] removed = new String[array.length - occ];

        for(int i = 0; i < array.length; i++){
            if (array[i] != valueToRemove){
                removed[k] = array[i];
                k++;
            }

        }
        return removed;

    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        String[] removed = {};

        ArrayList<String> arr = new ArrayList<>();

        arr.add(array[0]);

        for (int i = 1; i < array.length; i++) {
            if (array[i-1] != (array[i])) {
                arr.add(array[i]);
            }
        }
        return arr.toArray(removed);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        ArrayList<String> arr = new ArrayList<>();

        String[] result = {};

        arr.add(array[0]);

        for (int i = 1; i < array.length; i++) {
            if (array[i-1] == (array[i])) {
                arr.set(arr.size()-1, arr.get(arr.size()-1) + array[i]);
            }
            else {
                arr.add(array[i]);
            }
        }

        return arr.toArray(result);
    }


}
