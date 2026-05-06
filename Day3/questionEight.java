public class questionEight {

    public static int solve(int x, int y){
        if(x < 5){
            solve(x + 2, y);
        }
        return y;
    }
    public static void main(String[] args) {
        int result = solve(3,5);
        System.out.println(result);
    }
}
