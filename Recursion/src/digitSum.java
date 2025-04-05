public class digitSum {
    public static void main(String[] args){
        int ans = ds(343);
        System.out.println(ans);

    }
    static int ds(int n){
        if(n==0){
            return 0;
        }
        return (n%10)+ds(n/10);
    }
}
