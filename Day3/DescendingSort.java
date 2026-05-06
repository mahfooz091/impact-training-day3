public class DescendingSort {
    public static void main(String[] args) {
        int arr[] = {2, 1, 4, 7, 5, 8};

        // 1. Sort the entire array first
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // 2. Print the final result after all loops finish
        for (int num : arr) {
         System.out.print(num + " ");
}
    }
}
