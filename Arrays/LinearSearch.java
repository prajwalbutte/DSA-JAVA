import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array:");
        int n = sc.nextInt();
        
        int[] numberSet = new int[n]; 
        for(int i=0;i<n;i++){
            System.out.println("Enter number to array:");
            int number = sc.nextInt();
            numberSet[i] = number;
        }
        System.out.println("Enter the number to search");
        int target = sc.nextInt();

        for(int i=0;i<n;i++){
            if(numberSet[i] == target){
                System.out.printf("Target number %d found at index %d",target,i);
            }
            sc.close();
        }
    }
}