public class Functions {
    //main function
    public static void main(String[] args){
        sayHello("Jo",15);
        sayHello("Donna",19);
        int max = getMax(10,5);
        System.out.println(max);
    }
    // functions
    public static void sayHello(String name, int age){
        System.out.println("Hello "+name+"!"+"\n Your age is "+age+".");
    }

    // function return
    public static int getMax(int num1, int num2){
        if (num1 > num2){
            return num1;
        }else {
            return num2;
        }
    }
}
