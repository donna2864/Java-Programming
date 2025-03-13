import java.util.Arrays;
import java.util.Scanner;

public class BuildArrayfromPermutation {
    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        for(int i=0; i<nums.length; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(buildArray(nums)));
        sc.close();
    }
}
