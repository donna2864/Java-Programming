import java.util.*;
public class fibonacci_Series{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = 0;
    int b = 1;
    int count = sc.nextInt();
    if(count == 0){
      System.out.println(a);
    } else if(count == 1){
      System.out.println(b);
    } else if (count >= 2){
      System.out.print(a + " " + b + " ");
      int i = 2;
      while(i <= count){
        int temp = b;
        b = a + b;
        a = temp;
        System.out.print(b + " ");
        i++;
      } else{
      System.out.println("Invalid Input");
  }
  } 
}
