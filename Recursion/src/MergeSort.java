import java.util.Arrays;

import static java.io.ObjectInputFilter.merge;

public class MergeSort {
    public static void main(String[] args){
        int[] arr={1,44,6,6,7,7,3,8,2};
        arr=mergeSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static int[] mergeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int m = arr.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr,0,m));
        int[] right = mergeSort(Arrays.copyOfRange(arr,m,arr.length));

        return merge(left,right);
    }
    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
}
