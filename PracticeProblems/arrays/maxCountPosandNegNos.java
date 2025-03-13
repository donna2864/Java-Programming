public class maxCountPosandNegNos{
    public static int maximumCount(int[] nums) {
        int positive_count = 0;
        int negative_count =0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]<0){
                negative_count++;
            }else if(nums[i]> 0){
                positive_count++;
            }
        }
        if (positive_count > negative_count){
            return positive_count;
        }else{
            return negative_count;
        }
    }
    public static void main(String[] args) {
        int[] arr = {-3,-2,-1,0,0,1,2};
        int result = maximumCount(arr);
        System.out.println(result);
    }
}