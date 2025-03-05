package Problems;
import java.util.*;

public class factorsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for( int i=1; i<= n/2; i++){
            if(n%i == 0){
                System.out.print(i + " ");
            }
        }
        System.out.print(n);
    }
}
