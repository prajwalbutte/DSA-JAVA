public class SecondMax {
    public static void main(String[] args) {
        int arr[] = {4,10,10,6,3,8};
        
        int firstLargest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(firstLargest<arr[i]){
                firstLargest= arr[i];
            } 
        }
        System.out.println(firstLargest);

        int secondMax=arr[1];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=firstLargest){
                secondMax = arr[i];
            }
        }
        System.out.println("The second largest number is "+secondMax);
        

        
    }
}
