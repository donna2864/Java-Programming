import java.util.ArrayList;
import java.util.List;

public class GreatestNoOfCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandy = 0;
        for (int i=0; i<candies.length; i++){
            if(maxCandy<candies[i]){
                maxCandy = candies[i];
            }
        }
        List<Boolean> result = new ArrayList<>();
        for(int j=0; j<candies.length; j++){
            if(candies[j]+extraCandies>=maxCandy){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] candies = {2,1,3,4,5,2,1};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
    } 
}
