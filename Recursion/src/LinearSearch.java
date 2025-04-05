public class LinearSearch {
    public static void main(String[] args){
        int[] arr ={1,6,77,99,54};
        int target = 6;
        System.out.println(find(arr,target,0));
    }
    static boolean find(int[] arr,int target, int index){
        if(index == arr.length){
            return false;
        }
        return arr[index]==target || find(arr,target,index+1);
    }

}
