package Problems;
import java.util.*;

public class hcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        sc.close();

        if(n1 == 0){
            System.out.println(n2);
        }else if(n2 ==0){
            System.out.println(n1);
        }else {
            while(n2 != 0){
                int temp = n2;
                n2 = n1%n2;
                n1 = temp;
            }
            System.out.println(n1);
        }
    }
}
