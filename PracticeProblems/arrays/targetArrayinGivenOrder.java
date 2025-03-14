import java.util.ArrayList;
import java.util.Arrays;

public class targetArrayinGivenOrder {
   public static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> resultList = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            resultList.add(index[i], nums[i]);
        }
        int[] target = new int[resultList.size()];
        for(int i=0; i<resultList.size(); i++){
            target[i] = resultList.get(i);
        }
        return target;
    } 
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,2,1,3};
        int[] index = {1,2,3,5,6,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }
}
