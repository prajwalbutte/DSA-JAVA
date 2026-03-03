public class TwoSum {

    public static void main(String[] args){
        int[] nums = {1,5,8,-3};
        int target = 2;

        for(int i=0;i<nums.length;i++){
            for(int j=1;j<nums.length;j++){
                int sum = nums[i]+nums[j];
                if(sum == target){
                    System.out.printf("The elements whose sum is %d are at position %d and %d",target,i,j);
                }

        }
    }
}
}