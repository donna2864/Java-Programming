package Problems;
import java.util.*;

public class isprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        boolean isprime;
        if(n <= 1){
            isprime = false;
        } else{
            isprime = true;
            for(int i=2; i<=Math.sqrt(n); i++){
                if(n%i == 0){
                    isprime = false;
                    break;
                }
            }
        }
        System.out.println(isprime);
    }
}

