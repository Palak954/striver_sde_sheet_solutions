public class sortArray {
    public static void sort012(int a[], int n)
    {
        int count0s = 0;
        int count1s = 0;
        int count2s = 0;
        for(int i=0;i<n;i++){
            if(a[i] == 0)
            count0s++;
            else if(a[i] == 1)
            count1s++;
            else
            count2s++;
        }
        int a1 = 0;
        for(int i=0;i<n;i++){
            while(count0s != 0){
                a[a1] = 0;
                a1++;
                count0s--;
            }
            while(count1s != 0){
                a[a1] = 1;
                a1++;
                count1s--;
            }
            while(count2s != 0){
                a[a1] = 2;
                a1++;
                count2s--;
            }
        }
        // code here 
    }
}