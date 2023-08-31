import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class mergearrays {
        public static List< Integer > sortedArray(int []a, int []b) {
        int m = a.length;
        int n = b.length;
        List<Integer> al = new ArrayList<Integer>();
        HashSet<Integer> hs = new HashSet<Integer>();

        for(int i=0;i<m;i++){
            hs.add(a[i]);
        }
        for(int i=0;i<n;i++){
            hs.add(b[i]);
        }
        for(int i : hs){
            al.add(i);
        }
        Collections.sort(al);
        return al;
        // Write your code here
    }
}
