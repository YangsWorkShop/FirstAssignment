
/**
 * Created by Yang on 1/23/20. Edited by Yifei Chen on 6/26/2020
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
		int lastIndex = array.length;
		return array[lastIndex - 1];
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
		String[] reversedArray = new String[array.length];
		for (int i = 0; i < array.length; i++) {
			reversedArray[i] = array[array.length - 1 - i];
		}
		return reversedArray;
	}

	/**
	 * @param array array of String objects
	 * @return true if the order of the array is the same backwards and forwards
	 */ // TODO
	public static boolean isPalindromic(String[] array) {
		for (int i = 0; i < array.length / 2; i++) {
			if (array[i] != array[array.length - 1 - i]) {
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
		Character[] markArray = new Character[26];
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length(); j++) {
				boolean found = false;
				Character currentLetter = array[i].toLowerCase().charAt(j);
				// System.out.println(currentLetter);
				for (Character element : markArray) {
					if (element != null && currentLetter != ' ' && element == currentLetter) {
						found = true;
						// System.out.println("found:");
						// System.out.println(currentLetter);
					}
				}
				if (!found && currentLetter != ' ') {
					markArray[count] = currentLetter;
					count++;
					// System.out.println("add " + currentLetter);
				}

			}
		}
		// System.out.println("final marks:");
		for (Character element : markArray) {
			System.out.println(element);
		}
		return (count == 26);
	}

	/**
	 * @param array array of String objects
	 * @param value value to check array for
	 * @return number of occurrences the specified `value` has occurred
	 */ // TODO
	public static int getNumberOfOccurrences(String[] array, String value) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals(value)) {
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
		int numOfOccur = getNumberOfOccurrences(array, valueToRemove);
		String[] newArray = new String[array.length - numOfOccur];

		int find = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals(valueToRemove)) {
				find++;
			} else {
				newArray[i - find] = array[i];
			}
		}
		return newArray;
	}

	/**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
    	String last = null;
    	String[] newArray = new String[array.length];
    	for(int i = 0; i < array.length; i++){
    		if (!array[i].equals(last)){
    			newArray[i] = array[i];
    		}
    		last = array[i];
		}
    	
    	//count null occurance
    	int nullCount = 0;
    	for(int i = 0; i < newArray.length; i++){
    		if (newArray[i] == null){
    			nullCount++;
    		}
    	}
        //remove all nulls
        String[] cleanedArray = new String[newArray.length-nullCount];
    	int findNull = 0;
    	for(int i = 0; i < newArray.length; i++){
    		if (newArray[i] == null){
    			findNull++;
    		}else{
    			cleanedArray[i-findNull] = newArray[i];
    		}
    	}

        return cleanedArray;
    }

	/**
	 * @param array array of chars
	 * @return array of Strings with each consecutive duplicate occurrence
	 *         concatenated as a single string in an array of Strings
	 */ // TODO
	public static String[] packConsecutiveDuplicates(String[] array) {
		String last = null;
		int allConsecutiveCount = 0;
		int consecutiveCont = 0;
    	String[] newArray = new String[array.length];
    	for(int i = 0; i < array.length; i++){
    		if (array[i].equals(last)){
    			consecutiveCont++;
    			allConsecutiveCount++;
    			newArray[i-allConsecutiveCount] += array[i];
    		}else {
    			consecutiveCont=0;
    			newArray[i-allConsecutiveCount] = array[i];
    		}
    		last = array[i];
		}
    	String[] cleanArray = new String[newArray.length-allConsecutiveCount];
    	for(int i = 0; i < cleanArray.length; i++) {
    		cleanArray[i] = newArray[i];
    	}
    	
		return cleanArray;
	}

}
