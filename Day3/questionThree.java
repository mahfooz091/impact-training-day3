public class questionThree {

    public static int solve(int p, int q){
        int value;
        while(q > 0){
            value = p % q;
            p = q;
            q = value;
        }
        return p;
    }
    public static void main(String[] args) {
        // int result = solve(15, 4);
        int result = solve(4, 2);
        System.out.println(result);
    }
    
}
