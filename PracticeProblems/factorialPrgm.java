package Problems;
import java.util.*;

public class factorialPrgm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int facotrial = 1;
        for(int i=0; i<=n-1; i++){
            facotrial *= (n-i);
        }
        System.out.print("Facotrial of " + n + " is " + facotrial);
    }
}
