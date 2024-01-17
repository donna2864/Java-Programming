public class Operations {
    public static void main(String[] args){
        //operands
        int num1 = 5;
        float num2 = 3;

        //operations
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1/num2); //quotient
        System.out.println(num1 % num2); //remainder

        int myNum = 0;
        myNum += 1;
        System.out.println(myNum);

        myNum = 0;
        System.out.println("prefix incrementation "+ ++myNum);

        myNum = 2;
        System.out.println("postfix incrementation "+ myNum++);
    }
}
