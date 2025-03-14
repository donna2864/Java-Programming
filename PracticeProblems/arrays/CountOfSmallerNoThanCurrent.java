import java.util.Arrays;

public class CountOfSmallerNoThanCurrent {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int [] smallerValueCounts = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            int count = 0;
            for(int j=0; j<nums.length; j++){
                if(nums[i]>nums[j]){
                    count++;
                }
                smallerValueCounts[i] = count;
            }
        }
        return smallerValueCounts;
    }
    public static void main(String[] args) {
        int[] nums = {8, 1,2,3,2,4};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
}
