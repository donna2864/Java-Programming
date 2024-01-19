import javax.xml.transform.sax.SAXResult;

public class Car{
    public static void main(String[] args){
        Car1 car = new Car1("Tesla", "Donna R", "Black", 4);
        Plane plane = new Plane("Airplane","white","Donna", "AirEng123", 1);

        car.stop();
        car.move();

        plane.move();
        plane.stop();
    }
}
class Car1 extends Vehicle{
    private String model;
    private int door;

    public Car1(String name, String model, String color, int door) {
        super(name,color);
        this.model = model;
        this.door = door;
    }


}

class Vehicle{
    private String name;
    private String color;
    public Vehicle(String name, String color){
        this.name = name;
        this.color = color;
    }
    public void move(){
        System.out.println("the car" + this.name+"is moving");
    }
    public void stop(){
        System.out.println("The car " + this.name + "has stopped");
    }
}

class Plane extends Vehicle{
    private String model;
    private String engines;
    private int door;
    public Plane(String name, String color, String model, String engines, int door) {
        super(name,color);
        this.model = model;
        this.door = door;
        this.engines = engines;
    }

    //overriding functions
    @Override
    public void move() {
        super.move();
    }
}

