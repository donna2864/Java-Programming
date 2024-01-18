public class Oops1Main {
    public static void main(String[] args){
        OOPs car = new OOPs("Tesla", "Donna R", "Black", 4);
        OOPs car1 = new OOPs();
        System.out.println(car1.getName());

        car.move();
        car.stop();

        //getters method
        System.out.println(car.getName());
        System.out.println(car.getColor());
        System.out.println(car.getModel());
        System.out.println(car.getDoors());
        System.out.println("\n");

        //setter method
        car.setName("VENUE");
        System.out.println(car.getName());

        //giving getter and setter methods ensures encapsulations, values are not accessed directly
    }
}
