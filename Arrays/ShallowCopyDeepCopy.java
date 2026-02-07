import java.util.Arrays;
public class ShallowCopyDeepCopy{
    public static void main(String[] args) {
        int[] arr = {10,20,55,89};
        // int[] x = arr;
        // x[0] = 101;
        // System.out.println(arr[0]);
        int[] y = Arrays.copyOf(arr,arr.length);
        y[0] = 100;
        System.out.println(arr[0]);
    }
}