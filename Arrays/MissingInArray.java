public class MissingInArray {
    public static void main(String[] args) {
        int []arr = {1,2,3,6,5};
        int n = arr.length + 1;
        int sum = n*(n+1)/2;
        int arraySum = 0;
        for (int i : arr) {
            arraySum += i;
        }
        int missingElement = sum-arraySum;
        System.out.println(missingElement);
        System.out.printf("The missing element in array is %d",sum-missingElement);
        // System.out.println(arr.length+1);
        // System.out.println(sum);
    }
    
}
