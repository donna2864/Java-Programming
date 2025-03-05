package Problems;
import java.util.*;

public class discount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int discount = sc.nextInt();
        sc.close();
        System.out.println(price * discount/100);
    }
}
