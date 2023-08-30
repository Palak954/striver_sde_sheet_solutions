import java.util.*;
public class secondLargestSmallest {

    // brute force Approach

    public static int[] getSecondOrderElements(int n, int []a) {
        int a1[] = new int[2];
        Arrays.sort(a);
        a1[0] = a[n-2];
        a1[1] = a[1];
        return a1;
        // Write your code here.
    }

    // Optimal Approach
    
    public static int secondLargest(int n , int []a){
        int largest = Integer.MIN_VALUE;        
        int second_largest = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(a[i] > largest){
                second_largest = largest;
                largest = a[i];
            }
            else if(a[i] > second_largest && a[i] != largest){
                second_largest = a[i];
            }
        }
        return second_largest;
    }

        public static int secondSmallest(int n , int []a){
        int smallest = Integer.MAX_VALUE;        
        int second_smallest = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(a[i] < smallest){
                second_smallest = smallest;
                smallest = a[i];
            }
            else if(a[i] < second_smallest && a[i] != smallest){
                second_smallest = a[i];
            }
        }
        return second_smallest;
    }


}