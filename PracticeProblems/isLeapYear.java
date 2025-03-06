package Problems;

import java.util.Scanner;

public class isLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        sc.close();

        if((year%4 == 0 && year %100!=0) || (year% 400 == 0)){
            System.out.println("Leap year "+ year);
        } else{
            System.out.println("Not Leap Year " + year);
        }
    }
}
