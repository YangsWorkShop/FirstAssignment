    import java.util.Map;
    import java.util.HashMap;
    import java.util.List;
    import java.util.LinkedList;
    /**
     * Created by Yang on 1/23/20.
     */
    public class StringArrayUtils {
        /**
         * @param array array of String objects
         * @return first element of specified array
         */ // TODO
        public static String getFirstElement(String[] array) {
            //return null;
            if (array == null || array.length == 0) {
                return null;
            }
            return array[0];
        }
    
        /**
         * @param array array of String objects
         * @return second element in specified array
         */
        public static String getSecondElement(String[] array) {
            //return null;
            if (array == null || array.length <= 1) {
                return null;
            }
            return array[1];
        }
    
        /**
         * @param array array of String objects
         * @return last element in specified array
         */ // TODO
        public static String getLastElement(String[] array) {
            //return null;
            if (array == null || array.length == 0) {
                return null;
            }
            return array[array.length - 1];
        }
    
        /**
         * @param array array of String objects
         * @return second to last element in specified array
         */ // TODO
        public static String getSecondToLastElement(String[] array) {
            //return null;
            if (array == null || array.length <= 1) {
                return null;
            }
            return array[array.length - 2];
        }
    
        /**
         * @param array array of String objects
         * @param value value to check array for
         * @return true if the array contains the specified `value`
         */ // TODO
    public static boolean contains(String[] array, String value) {
        if(value == null) {
        //Prevent the null pointer exception from the subsequent x.equals() method
            return false;
        }
        //for each Iterate over the array
        for (String x : array) {
            if (value.equals(x)) {
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
        //Temporary exchange string
        String temp = "";
        //array length
        int lengthArray = array.length;
        for (int i = 0; i < lengthArray / 2; ++i) {
            temp = array[i];
            array[i] = array[lengthArray - 1 - i];
            array[lengthArray - 1 - i] = temp;
        }
        return array;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        if (array == null) {
            return false;
        }
        int lengthArray = array.length;
        for (int i = 0; i < lengthArray / 2; ++i) {
            if (array[i].equals(array[lengthArray - 1 - i]))
            {
                //Jump out of this loop and compare to the next
                continue;
            }
            else {
                return false;
            }
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        //define a hashmap store different letter values
        Map<Character,Integer> hashmap = new HashMap<>();
        for (String x : array) {
            //Change all letters in the string to lowercase letters
            x = x.toLowerCase();
            for (int i = 0; i < x.length(); ++i) {
                //Record the current character value
                char c = x.charAt(i);
                //Determine if the character is a letter
                if (Character.isLetter(c)) {
                    //Judge whether there is this value in the hashmap,if it is not stored in it, and then execution loop is continued
                    if (hashmap.get(c) == null) {
                        hashmap.put(c, 1);
                    }
                    else {
                        continue;
                    }
                }
                else {
                    continue;
                }
            }
        }
        //Determine the size of the hashmap. If it is 26, it means that it contains the entire alphabet. If it is not, it means that it does not.
        if (hashmap.size() == 26) {
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
        //count Number of value Occurrence
        int count = 0;
        for (String x : array) {
            if (value.equals(x)) {
                ++count;
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
        //Define a List to store values that do not need to be removed
        List<String> list = new LinkedList<>();
        for (int i = 0; i < array.length; ++i) {
            if (valueToRemove.equals(array[i])) {
                continue;
            }
            else {
                list.add(array[i]);
            }
        }
        return list.toArray(new String[0]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        //define a list to store the last consecutive duplicates value
        List<String> list = new LinkedList<>();
        //index start 0 to length - 2
        for (int i = 0; i < array.length - 1; ++i) {
            if (array[i] == array[i + 1]) {
                continue;
            }
            else {
                list.add(array[i]);
            }
        }
        //add the last index of array 
        list.add(array[array.length - 1]);
        //convert the list to array
        return list.toArray(new String[0]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        //define a list to store the last consecutive duplicates value
        List<String> list = new LinkedList<>();
        //Since String is immutable, we define a StringBuilder to connect equal strings
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < array.length - 1; ++i) {
            if (array[i] == array[i + 1]) {
                stringBuilder.append(array[i]);
            }
            else {
                stringBuilder.append(array[i]);
                list.add(stringBuilder.toString());
                //reset stringBuilder = ""
                stringBuilder = new StringBuilder();
            }
        }
        //Judge whether the last character string is equal to the previous character string, add the previous character string to the equality,
        //and add the last character string directly if it is not equal.
        if (array[array.length - 2] == array[array.length - 1]) {
            stringBuilder.append(array[array.length - 1]);
            list.add(stringBuilder.toString());
        }
        else {
            list.add((array[array.length - 1]));
        }
        //convert the list to array
        return list.toArray(new String[0]);
    }


}
