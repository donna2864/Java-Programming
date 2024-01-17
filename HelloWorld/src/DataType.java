public class DataType {
    public static void main(String[] args){
        // store whole numbers
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        System.out.println("Max value of int: "+max);
        System.out.println("Min value of int: "+min);

        byte maxByteValue = Byte.MAX_VALUE;
        byte minByteValue = Byte.MIN_VALUE;

        System.out.println("Max byte value: " + maxByteValue);
        System.out.println("Min byte value: " + minByteValue);

        long myNumber = 2147483647L;

        //fractional Number
        short maxi = Short.MAX_VALUE;
        short mini = Short.MIN_VALUE;

        System.out.println(maxi);
        System.out.println(mini);

        float num = 3.14f; // for floating point you need to end the number with a 'f', else it is a double
        double number1 = 2.0;

        // character types
        char letter = 'A'; //only one character can have only one letter stored in it.
        System.out.println(letter);

        // boolean types
        boolean isActive = false;
        System.out.println(isActive);

    }
}
