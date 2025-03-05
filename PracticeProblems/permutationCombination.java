package Problems;
import java.util.*;


public class permutationCombination {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int r = sc.nextInt();
       sc.close();

       int permutation = 1;
       int combination = 1;
       int numerator = 1; int denominator = 1;
       for(int i=0; i<=r-1; i++){
        numerator *= (n-i);
        denominator *= (r-i);
        combination = numerator/denominator;
        permutation *= n-i;
        }
        System.out.println("Permutation is " + permutation + " and Combination is " + combination);
    }
}
