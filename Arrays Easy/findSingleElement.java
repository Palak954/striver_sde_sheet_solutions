import java.util.HashMap;

public class findSingleElement {
        public static int getSingleElement(int []arr){
        HashMap<Integer , Integer> hm = new HashMap<Integer , Integer>();
        for(int i=0;i<arr.length;i++){
            if(!hm.containsKey(arr[i]))
            hm.put(arr[i] , 1);
            else
            hm.put(arr[i] , hm.get(arr[i]) + 1);
        }
        for(int i : hm.keySet()){
            if(hm.get(i) == 1)
            return i;
        }
        return -1;
        // Write your code here.
    }
}
