public class SmallNumber {
    public static void main(String[] args) {
        int[] arr = {3,-9,7,5,4};

        int smallNumber = arr[0];
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
            if(arr[i]<=smallNumber){
               smallNumber = arr[i];
            }
        }
        System.out.println("The smallest number in array is: " +smallNumber);        
        
    }
}
