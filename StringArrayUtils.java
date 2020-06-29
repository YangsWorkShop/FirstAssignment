 
import java.util.*;

/**
 * Created by Yang on 1/23/20.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    
     public static void main(String[] args){
        
        String[] arr = {"quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        String[] array = {"aba", "aba", "baa", "bab", "bba", "bba", "bba", "bba", "bbb", "bbb"};
        String[] array1 = {"aba", "aba", "baa", "bab", "bba", "bba", "bba", "bba", "bbb", "bbb"};
        String[] array2 = {"aba", "aba", "baa", "bab", "bba", "bba", "bba", "bba", "bbb", "bbb"};
        String method1 = getFirstElement(arr);
        System.out.println("method1 "+method1);
        String method2 = getSecondElement(arr);
        System.out.println("method2 "+method2);
        String method3 = getLastElement(arr);
        System.out.println("method3 "+method3);
        String method4 = getSecondToLastElement(arr);
        System.out.println("method4 "+method4);
        boolean method5 = contains(arr, "hello");
        System.out.println("method5 "+method5);
        String[] method6 = reverse(arr);
        System.out.println("method6 "+Arrays.toString(method6));
        String[] arr1 = {"a","b","c","b","a"};
        boolean method7 = isPalindromic(arr1);
        System.out.println("method7 "+method7);
        boolean method8 = StringArrayUtils.isPangramic(arr);
        System.out.println("method8: "+method8);
        int method9 = StringArrayUtils.getNumberOfOccurrences(array, "aba");
        System.out.println("method9 "+method9);
        String[] method10 = StringArrayUtils.removeValue(array2, "aba");
        System.out.println("method10: "+Arrays.toString(method10));
        String[] method11 = StringArrayUtils.removeConsecutiveDuplicates(array1);
        System.out.println("method11 "+Arrays.toString(method11));
        String[] array_new = {"t", "t", "q", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e"};
        String[] method12 = StringArrayUtils.packConsecutiveDuplicates(array_new);
        System.out.println("method12 "+Arrays.toString(method12));
        }
     
     public static String getFirstElement(String[] array) {
        String first;
        first = array[0];
        return first;
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        String second;
        second = array[1];
        return second;
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        String last;
        last = array[array.length - 1];
        return last;
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        String secondToLast;
        secondToLast = array[array.length - 2];
        return secondToLast;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for(int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
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
        int i = 0;
        int j = array.length - 1;
        while(i < j){
            String temp = array[i];
            array[i] = array[j];
            array[j] = temp;
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
        while(i < j){
            if(!array[i].equals(array[j])){
                return false;
            }
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
        HashSet<Character> hs = new HashSet<>();
        for(String s: array){
            for(int i =0;i < s.length();i++){
                if(s.charAt(i) != ' ')
                    hs.add(s.toLowerCase().charAt(i));
            }
        }
        if(hs.size()==26)
            return true;
        return false;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i].equals(value)){
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
        List<String> list = new ArrayList<String>(Arrays.asList(array));
        list.removeAll(Arrays.asList(valueToRemove));
        String[] array_result = new String[list.size()];
        return list.toArray(array_result);
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        List<String> list = new ArrayList<>();
        int j = 1;
        for(int i = 0; i < array.length - 1; i++){
            if(!array[i].equals(array[j])){
                list.add(array[i]);
            }
            j++;
        }
        if(array[array.length - 1].equals(array[array.length - 2])){
            list.add(array[array.length - 2]);
        }
        String[] new_array = new String[list.size()];
        return list.toArray(new_array);
       
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        List<StringBuilder> builders = new ArrayList<>();
        builders.add(new StringBuilder(array[0]));
        int builder_index = 0;
        for(int i=1; i< array.length ;i++){
            if(builders.get(builder_index).toString().contains(array[i])){
                builders.get(builder_index).append(array[i]);
            }else{
                builder_index++;
                builders.add(new StringBuilder(array[i]));
            }
        }
        String[] result = new String[builders.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = builders.get(i).toString();
        }
        return result;
    }


}
