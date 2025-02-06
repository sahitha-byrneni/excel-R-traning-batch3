import java.util.Arrays;

class Demo064 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int temp = arr[0];
        arr[0] = arr[5];
        arr[5] = temp;
        System.out.println("After swapping: " + Arrays.toString(arr));
    }
}