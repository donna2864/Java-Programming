package Problems;
import java.util.*;

public class reverseString {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String text = sc.nextLine();
       sc.close();

       for (int i=text.length()-1; i>=0; i--){
        System.out.print(text.charAt(i));
       }
    }
}
