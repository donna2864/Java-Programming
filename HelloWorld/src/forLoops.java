public class forLoops {
    public static void main(String[] args){
        // normal for loop
        for (int i=0; i <= 10; i++){
            System.out.println("i = "+i);
        }

        // break and continue usage
        for (int i=0; i<=5; i++){
            if (i == 5){
                break;
            }
        }
        for (int i=0; i<=10;i++){
            if (i>=3 && i<=5){
                continue;
            }
            System.out.println("i = "+i);
        }

        // while loops
        int number = 0;
        while (number <=10){
            number++;
            System.out.println(number);
        }

        int num1 = 0;
        do{  // do will execute the function with atleast once
            System.out.println(num1);
            num1++;
        }while (num1 >=1);
    }
}
