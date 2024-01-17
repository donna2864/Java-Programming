import java.util.Scanner;

public class ifStatements {
    //take input from the user:
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        int age = 27;

        if( age >= 18){
            System.out.println("You can vote");
            System.out.println("Please put in your vote in the ballot please");
        }
        else{
            System.out.println(" please come back after "+(18 - age)+" years");
        }
        // nested if loops

        int year = 2020;
        if (year == 2020) {
            System.out.println("The year is = "+ year);
        } else if (year == 2022){
            System.out.println(" The year is " + year);
        } else if (year == 2024) {
            System.out.println("The year is " + year);
        } else{
            System.out.println("all condition fail");
        }

        // IS Not operator

        boolean isActive = false;
        if (isActive){
            System.out.println("user is active");
        } else if (!isActive) {
            System.out.println("user is not active"); //! indicates a NOT operator
        }else {
            System.out.println("user not defined");
        }

        // AND operator

        boolean isActive1 = true;
        int score = 100;

        if (score >= 100 && isActive1){
            System.out.println("the score is less than " + score + "and the user is active \n you are in the next level");
        } else {
            System.out.println(" you are in the same level");
        }

        // OR operator

        int num1 = 5;
        int num2 = 4;
        if (num1 > 0 || num2 > 0) {
            System.out.println("The condition is true.");
        } else{
            System.out.println("all conditions fail.");
        }

        //SWITCH operation
            // break is really essential to execute the proper cases.
//        int time = 2;
        System.out.println("What is the time right now: ");
        int time = scanner.nextInt();
        switch (time) {
            case 10:
                System.out.println("The time is " + time + "\n Time for coffee.");
                break;
            case 12:
                System.out.println("The time is " + time + "\n Time for lunch");
                break;
            default:
                System.out.println("Time to relax");
                break;
        }

            // in enhanced switch you need not put break statements
            // if we have more statements the use curly braces.
        System.out.println("What is the time right now: ");
        int time1 = scanner.nextInt();
        switch (time1) {
            case 10 -> System.out.println("The time is " + time1 + "\n Time for coffee.");
            case 12 -> System.out.println("The time is " + time1 + "\n Time for lunch");
            default -> System.out.println("Time to relax");
        }
    }
}
