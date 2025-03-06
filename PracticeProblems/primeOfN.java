package Problems;
import java.util.Scanner;

public class primeOfN {
    public static boolean isPrime(int n){
        for(int i=2; i<= Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        if (n <= 1){
            System.out.println(n + "is not possible");
        }
        else{
            for (int i=2; i<=n; i++){
                if(isPrime(i)){
                    System.out.print(i + " ");
                }
            }
        }
    }
}
