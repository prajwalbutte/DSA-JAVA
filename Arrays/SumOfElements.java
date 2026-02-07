import java.util.Scanner;
public class SumOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n = sc.nextInt();
        int[] Elements = new int[n];
        System.out.print("Enter array elements:");

        for(int i=0;i<n;i++){
            Elements[i] = sc.nextInt();            
        }
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += Elements[i];
        }
        System.out.print("The sum of elements in array is "+sum);
        sc.close();
    }
    
}
