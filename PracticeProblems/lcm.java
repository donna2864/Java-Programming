package Problems;
import java.util.*;

public class lcm {
    public static int GCD(int a, int b){
        if(a==0){
            return b;
        } else if(b == 0){
            return a;
        } else{
            while(b!=0){
                int temp = b;
                b = a%b;
                a = temp;
            }
            return a;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        sc.close();
        
        int gcd = GCD(n1, n2);
        int product = n1*n2;
        int lcm = product/gcd;
        System.out.println(lcm);
        
    }

    
}
