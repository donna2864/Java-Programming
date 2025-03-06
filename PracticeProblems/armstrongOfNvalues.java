package Problems;

import java.util.Scanner;

public class armstrongOfNvalues {
    public static boolean isArmstrongNo(int n){
        int len = String.valueOf(n).length();
        int sum = 0;
        int orgNum = n;
        while(n>0){
            int value = n%10;
            sum += Math.pow(value,len);
            n = n/10;
        }
        return sum == orgNum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        for (int i=0; i<= n-1; i++){
            if(isArmstrongNo(i)){
                System.out.print(i + " ");
            }
        }
    }
}
