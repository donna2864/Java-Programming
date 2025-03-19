public class FindCountOfEvenDigits{
  public static int findNumbers(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            int size = (int)Math.log10(nums[i])+1;
            if(size %2 == 0){
                count++;
            }
        }
        return count;
    }
  public static void main(String[] args){
    int[] nums = {12, 234, 34, 2, 6, 1234};
    System.out.println(findNumbers(nums));
  }
}
