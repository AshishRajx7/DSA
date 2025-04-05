public class nto1 {
    public static void main(String[] args){
        int r =fun(5);
        System.out.println(r);
    }
    static int fun(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*fun(n-1);
    }

}
