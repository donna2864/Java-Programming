import java.util.Arrays;

public class DivideArrayIntoEqualPairs {
    public static boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i+=2){
            if(nums[i]!=nums[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,3,2,2,2};
        System.out.println(divideArray(nums));
    }
}
