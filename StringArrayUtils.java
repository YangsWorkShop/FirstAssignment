 

/**
 * Created by Yang on 1/23/20.
 */
import java.util.ArrayList;
import java.util.Arrays;
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
        for (String item : array) {
            if (item == value)  {
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
        int i = 0, j = array.length - 1;
        while (i < j) {
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
        int i = 0, j = array.length - 1;
        while (i < j) {
            if (array[i] != array[j])  {
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
       int[] result = new int[26];
        for (String eachString : array) {
        	for (char eachChar : eachString.toCharArray()) {
        		if (eachChar == ' ') {
        			continue;
        		}
        		if (eachChar < 'a') {
        			eachChar += 32;
        		}
        		result[eachChar - 'a'] += 1  ;
        	}
        }
        for (int exist : result) {
        	if (exist == 0) {
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
		for (String eachString : array) {
            if (eachString == value) {
            	count += 1;
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
        ArrayList<String> result =  new ArrayList<>();
		for (String eachString : array) {
			if (eachString != valueToRemove) {
				result.add(eachString);
				
			}
		}
		int i = 0;
        String[] list =  new String[result.size()];
        for (String eachString : result) {
        	list[i] = eachString;
        	i++;
        }
        return list;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> result =  new ArrayList<>();
        //initialize result
        result.add(array[0]);
        
        for (int j = 1; j < array.length; j++) {
        	if (array[j] != result.get(result.size() - 1)) {
        		result.add(array[j]);
        		
        	}
        }
        // convert arraylist to string[]
        int i = 0;
        String[] list =  new String[result.size()];
        for (String eachString : result) {
        	list[i] = eachString;
        	i++;
        }
        return list;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        ArrayList<String> result =  new ArrayList<>();
        
        int i = 0 , j = 1, k = 0, count = 1;
        while  ( j < array.length) {
        	if (array[j] == array[i]) {
        		count += 1;
        		j++;	
        	} else {
        		StringBuilder sb = new StringBuilder();
        		for (int l = 1; l <= count; l++) {
        			sb.append(array[i]);
        		}
        		result.add(sb.toString());
        		//move the pointer i
        		i = j;
        		j++;
        		// reset counter to 1
        		count = 1;
        	}
        }
        //post-processing
        if (count > 0) {
        	StringBuilder sb = new StringBuilder();
    		for (int l = 1; l <= count; l++) {
    			sb.append(array[i]);
    		}
    
    		result.add(sb.toString());
        	
        }
        // covert arraylist to string[]
        int l = 0;
        String[] list =  new String[result.size()];
        for (String eachString : result) {
        	list[l] = eachString;
        	l++;
        }
        return list;
    }


}
