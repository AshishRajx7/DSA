import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args){
        int[] arr=  {5,4,7,2,8,9,3};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] nums, int low , int high){
        if(low>=high){
            return;
        }
        int s =low;
        int e = high;
        int m  =s+(e-s)/2;
        int piv = nums[m];

        while(s<=e){
            while(nums[s]  < piv){
                s++;
            }
            while(nums[e] > piv){
                e--;
            }
            if(s<=e){
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }
        sort(nums,low,e);
        sort(nums,s,high);
    }
}
