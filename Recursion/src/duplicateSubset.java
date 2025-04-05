import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class duplicateSubset {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        List<List<Integer>> ans = subset(arr);
        for(List<Integer> list:ans){
            System.out.println(list) ;
        }
    }
    //return list that contains a list of integer
    static List<List<Integer>> subset(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>(); // create outer list

        outer.add(new ArrayList<>()); // adds new empty list

        for(int num:arr){
            int n = outer.size(); // get the current size of outer list, starts from 1 as we added an empty list above
            for(int i=0;i<n;i++){
                List<Integer> internal = new ArrayList<>(outer.get(i)); // make a copy of the original list
                internal.add(num);
                outer.add(internal); // individual list getting added in main list
            }
        }
        return outer;
    }
}
