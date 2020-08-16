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
    	boolean sig = false;
    	for(Integer i = 0; i < array.length; i ++) {
    		if(array[i] == value) {
    			sig = true;
    		}
    	}
        return sig;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
    	String[] res = new String[array.length];
    	for(Integer i = array.length - 1, j = 0; j < array.length; i --, j ++) {
    		res[j] = array[i];
    	}
        return res;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
    	boolean sig = false;
    	Integer len = array.length;
    	if(len % 2 == 0) {
    		for(Integer i = 0, j = len - i - 1; i < len / 2; i ++, j --) {
    			if(array[i] == array[j]) {
    				sig = true;
    			} else {
    				sig = false;
    			}
    		}
    	} else {
    		for(Integer i = 0, j = len - i - 1; i < (len - 1) / 2; i ++, j --) {
    			if(array[i] == array[j]) {
    				sig = true;
    			} else {
    				sig = false;
    			}
    		}
    	}
        return sig;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
    	for(Integer i = 0; i < array.length; i ++) {
    		array[i] = array[i].replaceAll("\\s*", "").toLowerCase();
    	}
//    	Integer k = 0;
//    	Integer sig = 0;
//    	Integer sig2 = 0;
//    	String t = ""; 
    	boolean res = false;
    	Integer rep1 = 0;
    	Integer rep2 = 0;
//    	String[] temp = new String[array.length];
    	for(Integer i = 0; i < array.length - 1; i ++) {
    		for(Integer j = i + 1; j < array.length; j ++) {
    			if(array[i] == array[j]) {
    				array[j] = "0";
    				rep1 ++;
    			}
    		}
    	}
//    	Arrays.sort(array);
    	String r = "";
    	for(Integer j = 0; j < array.length; j ++) {
    		if(array[j] != "0") {
    			r += array[j];
    		}
    	}
    	char[] temp = new char[r.length()];
    	temp = r.toCharArray();
    	
    	Arrays.sort(temp);
    	for(Integer i = 0, j = i + 1; i < temp.length - 1; i ++, j ++) {
    			if(temp[i] == temp[j]) {
    				temp[i] = 0;
    				rep2 ++;
    			}
    	}
    	if(temp.length - rep2 == 26) {
    		res = true;
    	}
    	//total string delete repeat, sort delete
//    	for(Integer i = 0; i < array.length; i ++) {
//    		char[] temp = new char[array[i].length()];
//    		temp = array[i].toCharArray();
//    		for(Integer j = 0; j < array[i].length() - 1; j ++) {
//    			for(k = j + 1; k < array[i].length(); k ++) {
//    				if((temp[k] == temp[j]) && (temp[j] != '0') && (temp[k] != '0')) {
//    					temp[k] = '0';
//    					sig ++;
//    				}
//    			}	
//    		}
//    		Arrays.sort(temp);
//    		char[] dic = new char[temp.length - sig + 1];
//    		for(Integer p = sig, q = 0; p < temp.length; p ++, q ++) {
//    			dic[q] = temp[p];
//    		}
//    		t += String.valueOf(dic);
//    	}
//    	char[] test = new char[t.length()];
//    	test = t.toCharArray();
//    	if(test.length < 26) {
//    		res = false;
//    	} else {
//    		for(Integer i = 0; i < test.length - 1; i ++) {
//    			for(Integer j = i + 1; j < test.length; j ++) {
//    				if((test[i] == test[j]) && (test[j] != '0') && (test[i] != '0')) {
//    					test[j] = '0';
//    					sig2 ++;
//    				}
//    			}
//    		}
//    		Arrays.sort(test);
//    		if(test.length - sig2 == 26) {
//    			res = true;
//    		} else {
//    			res = false;
//    		}
//    	}
//    	2 Assertion errors and 4 success
        return res;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
    	int times = 0;
    	for(int i = 0; i < array.length; i ++) {
    		if(array[i] == value) {
    			times ++;
    		}
    	}
        return times;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
    	String[] res = new String[array.length - 1];
    	for(Integer i = 0, j = 0; i < array.length; i ++) {
    		if(array[i] != valueToRemove) {
    			res[j ++] = array[i];
    		}
    	}
        return res;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
    	Integer sig = 0;
    	Integer rep = 0;
    	for(Integer i = 0, j = i + 1; i < array.length - 1; i ++, j ++) {
    		if(array[i] == array[j]) {
    			array[i] = "0";
    			rep ++;
    		}
    	}
    	String[] res = new String[array.length - rep];
    	for(Integer i = 0; i < array.length; i ++) {
    		if(array[i] != "0") {
    			res[sig++] = array[i];
    		}
    	}
        return res;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
    	Integer sig = 0;
    	Integer rep = 0;
    	String[] temp = new String[array.length];
    	for(Integer i = 0; i < array.length; i ++) {
    		temp[i] = array[i];
    	}
    	for(Integer i = 0, j = i + 1; i < array.length - 1; i ++, j ++) {
    		if(array[i] == array[j]) {
    			temp[j] += temp[i];
    			temp[i] = "0";
    			rep ++;
    		}
    	}
    	String[] res = new String[array.length - rep];
    	for(Integer i = 0; i < array.length; i ++) {
    		if(temp[i] != "0") {
    			res[sig++] = temp[i];
    		}
    	}
        return res;
    }


}
