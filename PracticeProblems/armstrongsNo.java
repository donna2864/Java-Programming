package Problems;

import java.util.Scanner;

public class armstrongsNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int expo = String.valueOf(n).length();
        int sum = 0;

        int orgNum = n;

        while(n>0){
            int base = n%10;
            sum += Math.pow(base, expo);
            n = n/10;
        }

        if(sum == orgNum){
            System.out.println(orgNum + " is an Armstrong's Number");
        } else{
            System.out.println(orgNum + " not an Armstrong's Number");
        }

    }
}
