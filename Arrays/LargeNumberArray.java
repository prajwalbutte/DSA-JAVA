import java.util.Scanner;
public class LargeNumberArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            System.out.print("Enter number to add in array: ");
            arr[i] = sc.nextInt();

        }

        int smallNumber = arr[0];
       
        for(int i=0;i<arr.length;i++){
         if(arr[i]<smallNumber){
             smallNumber = arr[i];
        }
        
       }
        System.out.println("The small number is "+smallNumber);
        sc.close();
}
}
