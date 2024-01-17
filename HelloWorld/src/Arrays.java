public class Arrays {
    public static void main(String[] args){
        int[] number = {12,15,60,100,200,20,50};
        for (int i=0; i<number.length; i++){
            System.out.println(number[i]);
        }
        // arrays have a fixed size
        System.out.println("\n");
        String[] names = {"Donna","John","Joshua","Rose"};
        for (String friend: names){
            System.out.println(friend); // different way to iterate between the array entities
        }

        // to find the biggest number
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int maxnumber = Challenge(numbers);
        System.out.println(maxnumber);
    }

    public static int Challenge(int[] numbers) {
        int max = numbers[0];
        for (int number:numbers){
            if (number > max){
                max = number;
            }
        }
        return max;
    }
}
