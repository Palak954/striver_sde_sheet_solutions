import java.util.HashMap;

public class LongestSubarayNegatives {
    	public static int getLongestSubarray(int []a, int k) {
		HashMap<Integer , Integer> hm = new HashMap<>();
        int curr_summ = 0;
        int maxx_value = 0;
        for(int i=0;i<a.length;i++){
            curr_summ = curr_summ + a[i];
			if(curr_summ == k)
			maxx_value = Math.max(maxx_value , i+1);
            if(hm.containsKey(curr_summ - k))
            maxx_value = Math.max(maxx_value , i-hm.get(curr_summ - k));
            if(!hm.containsKey(curr_summ))
            hm.put(curr_summ , i);
        }
        return maxx_value;
		// Write your code here.
	}
}
