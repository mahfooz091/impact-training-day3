public class avgArray {
    public static void main(String[] args) {
        int sum = 0;
        int avg;
        int[] arr = {1, 2, 3, 4, 5};
        for(int i = 0; i < 5; i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
        avg = sum / (arr.length);
        System.out.println(avg);
    }    
}
