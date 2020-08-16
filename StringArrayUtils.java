 
import java.util.*;
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
        for(String s : array){
        if(s==value)
            return true;
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String s[]=new String[array.length];
        int j=array.length-1;
        for(int i=0;i<array.length;i++){
            s[j]=array[i];
            j=j-1;
        }
        return s;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String s[]=new String[array.length];
        int j=array.length-1;
        for(int i=0;i<array.length;i++){
            if(array[j]==array[i])
                j=j-1;
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
        HashSet<Character> check = new HashSet<Character>();
        for(String s : array){
            for(int i =0;i<s.length();i++){
                if(s.charAt(i)!=' ')
                   check.add(s.toLowerCase().charAt(i));
            }
        }
        if(check.size()==26)
           return true;
        return false;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count=0;
        for(int i=0;i<array.length;i++){  
            if(array[i]==value){
             count=count+1;   
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
        String s[]=new String[array.length-1];
        int j=0;
        for(int i=0;i<array.length;i++){
            if(array[i]!=valueToRemove){
                   s[j]=array[i];
                   j=j+1;
            }    
            else
                continue;
        } 
        return s;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
       ArrayList<String> s=new ArrayList<String>();
        s.add(array[0]);
        for( int i=1;i<array.length;i++) {
            if (array[i]!=array[i-1]) 
                s.add(array[i]);
        }
        String[] result=new String[s.size()];
        return s.toArray(result);
        
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        ArrayList<String> s=new ArrayList<String>();
        s.add(array[0]);
        for( int i=1;i<array.length;i++) {
            if (array[i]!=array[i-1]) 
                 s.add(array[i]);
            else{
                 int j=s.size()-1;
                 String element=array[i]+s.get(j);
                 s.set(j, element);
            }
        }
        String[] result = new String[s.size()];
        return s.toArray(result);
    }


}
