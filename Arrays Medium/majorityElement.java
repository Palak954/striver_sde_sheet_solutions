import java.util.*;
public class majorityElement {
    public static int majorityelement(int []v) {
        HashMap<Integer , Integer> hm = new HashMap<>();
        for(int i=0;i<v.length;i++){
            if(!hm.containsKey(v[i]))
            hm.put(v[i] , 1);
            else
            hm.put(v[i] , hm.get(v[i])+1);
        }
        for(int i : hm.keySet()){
            if(hm.get(i) > v.length/2)
            return i;
        }
        return -1;
        // Write your code here
    }
}
