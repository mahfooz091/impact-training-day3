public class questionTen {
    public static void main(String[] args) {
        int x = 1, y = 2, z = 3;
        x = y + z;
        z = x - y;
        z = z + x;
        z = y + z; 
        y = y + z; 
        System.out.println(x + " " + y + " " + z);
    }
    
}
