 

/**
 * Created by Yang on 1/23/20.
 */
import java.util.ArrayList;
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
        for(int i =0; i< array.length;i++){
        if(array[i].equals(value))
        return true;
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] x = new String[array.length];
        for(int i =0; i< array.length;i++){
        x[i]=array[array.length-1-i];
        }
        return x;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String[] x = new String[array.length];
        for(int i =0; i< array.length/2;i++){
        if(array[i].equals(array[array.length-1-i]))
        ;
        else
        return false;
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        boolean [] visited = new boolean[26];
        
        for(int i =0;i<array.length;i++){
        String x = array[i];
        x=x.toLowerCase();
            for(int j =0; j<x.length();j++)
            { char curr = x.charAt(j);
                if(curr>='a'&&curr<='z')
                visited[curr -'a']=true;
        }
    }
        for(int i =0; i<26;i++){
        if(!visited[i])
        return false;
    }
        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count =0;
        for(int i =0; i< array.length;i++){
        if(array[i].equals(value))
        count++;
        }
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        int c = getNumberOfOccurrences(array,valueToRemove);
        String[] x = new String[array.length-c];
        int j =0;
        for(int i =0; i< array.length;i++){
        if(!array[i].equals(valueToRemove))
            x[j++]=array[i];
        }
        return x;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        
        ArrayList<String> xx = new ArrayList<String>();      
        String prev = array[0];
        String curr = "";
        int j=1;
        xx.add(prev);
        for(int i =1; i< array.length;i++){
     
        curr = array[i];
        if(prev.equals(curr))
        ;
        else
        xx.add(array[i]);
        
        prev = array[i];
        }
        
        String[] x = new String[xx.size()];
        for(int i =0; i<xx.size();i++){
        x[i]=xx.get(i);
        }
       // System.out.println(x);
        return x;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
         
        ArrayList<String> xx = new ArrayList<String>();
       
        String prev = array[0];
        String curr = "";
        int j=1;
        xx.add(prev);
        for(int i =1; i< array.length;i++){
     
        curr = array[i];
        if(prev.equals(curr))
        xx.set(j-1,(xx.get(j-1)+curr));
        else{
        xx.add(array[i]);
        j++;
    }
        
        prev = array[i];
        }
        
        String[] x = new String[xx.size()];
        for(int i =0; i<xx.size();i++){
        x[i]=xx.get(i);
        }
       // System.out.println(x);
        return x;
    
    }


}
