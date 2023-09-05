import java.util.*;
public class twoSum {
        public static String read(int n, int []book, int target){
        Arrays.sort(book);
        int i=0;
        int j = n-1;
        int summ = 0;
        while(i < j){
            summ = book[i] + book[j];
            if(summ == target)
            return "YES";
            else if(summ > target)
            j--;
            else
            i++;
        }
        return "NO";
        // Write your code here.
    }
}