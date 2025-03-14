import java.util.Arrays;

public class shuffleArray {
    public static int[] shuffle(int[] nums, int n) {
        int[] shuffleArr = new int[nums.length];
        int index = 0;
        for (int i = 0; i < n; i++) {
            shuffleArr[index++] = nums[i];   
            shuffleArr[index++] = nums[i + n]; 
        }

        return shuffleArr;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,2,6,3};
        int n = 3;
        System.out.println(Arrays.toString(shuffle(nums, n)));
    }
}
