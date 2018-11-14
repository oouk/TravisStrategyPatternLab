/**
 * Program Name: Travis and Strategy Pattern
 * Created Date: Nov 14, 2018
 * @author Odom Ouk
 * @version 1.0 
 * Email: oouk@horizon.csueastbay.edu
 */

package travisstrategypattern; 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;


public class TravisStrategyPattern {
    
    public static <T> int linearSearch(List<T> list, Predicate<T> check) {
        
        for (int i = 0; i < list.size(); i++){
           if (check.test(list.get(i)) == true)
            
            return i;
        }
        
        return -1;
    }

 public static void main(String[] args) {
     
     List<String> stringList = Arrays.asList("1", "2", "3", "4", "5");
     List<Integer> intList = Arrays.asList(1, 3, 5, 7, 9);
     
     Predicate<String> checkString = i -> (i.equals("1"));
     
     Predicate<Integer> checkInt = i ->(i.equals(5));
     
     Predicate<String> notList = i ->(i.equals("6"));
     
     System.out.println("A match in the first position from stringList: " +
             linearSearch(stringList, checkString));
     System.out.println ("\nA match in a different position from intList: " +
             linearSearch(intList, checkInt));
     System.out.println ("\nA match not in stringList: " +
             linearSearch(stringList, notList));
     
     

    }
}
