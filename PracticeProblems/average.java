package Problems;
import java.util.*;

public class average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int sum =0;
        for(int i=0; i<= n; i++){
            sum += i;
        }
        float avg = (float)sum/n;
        System.out.println(avg);
    }
}
