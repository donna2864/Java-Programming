import java.math.BigInteger;
import java.util.*;

public class ArrayFromToInteger {
    public static List<Integer> addToArrayForm(int[] num, int k) {
        StringBuilder valueStr = new StringBuilder();
        for(int i: num){
            valueStr.append(i);
        }
        BigInteger total = new BigInteger(valueStr.toString()).add(BigInteger.valueOf(k));
        List<Integer> result = new ArrayList<>();
        for(char digit: String.valueOf(total).toCharArray()){
            result.add(digit - '0');
        }
        return result;
    }
    public static void main(String[] args){
      int[] num = {1,2,3,4};
      int k = 34;
      System.out.println(Arrays.toString(addToArrayForm(num, k)));
    }
}
