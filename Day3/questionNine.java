public class questionNine {
    public static void main(String[] args) {
        int b = 10, c = 11, a;
        
        a = b - c; // a = -1
        
        // Loop from 2 to -1: start > end, so it never runs
        for (int i = 2; i <= a; i++) {
            b = b + i + 10;
            b = b / 2;
        }
        
        c = a + b + c; // -1 + 10 + 11 = 20
        
        System.out.println(a + " " + b + " " + c);
    }
}
