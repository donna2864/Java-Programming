package Problems;

import java.util.Scanner;

public class pythagoreanTriplet {
    public static boolean ispythagoreousTriplet(int a, int b, int c){
        int a2 = (int) Math.pow(a, 2);
        int b2 = (int) Math.pow(b, 2);
        int c2 = (int) Math.pow(c, 2);
        if((a2+b2) == c2){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    int n3 = sc.nextInt();
    sc.close();

    boolean res = ispythagoreousTriplet(n1, n2, n3);
    System.out.println(res);
  }  
}
