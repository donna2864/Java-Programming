import java.util.Arrays;

public class runningSum1DArray {
    public static int[] runningSum(int[] nums) {
        int sum = 0;
        int[] runningSum = new int[nums.length];
        for(int i=0; i<nums.length; i++){
                sum +=nums[i];
            runningSum[i] += sum;
        }
        return runningSum;
    }
    public static void main(String[] args) {
        int [] nums = {1,2,3};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
}
