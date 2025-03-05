package Problems;
import java.util.*;

public class primeFactors {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      sc.close();
      System.out.print("1" + " ");
      for(int i=2; i<= Math.sqrt(n); i++){
        if(n%i == 0){
            System.out.print(i + " ");
            n = n/i;
        }
      }
    }
}
