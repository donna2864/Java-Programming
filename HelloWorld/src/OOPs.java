public class OOPs {
    private String name;
    private String model;
    private String color;
    private int doors;

    public OOPs(String name, String model, String color, int doors){
        this.name = name;
        this.model = model;
        this.color = color;
        this.doors = doors;

    }

    //empty constructor: Calling the constructor, now you can prevent adding all the values in the input
    public OOPs(){
        this("Name", "Model", "Color", 0);
    }

    public OOPs(String name, String model){
        this(name,model,"Color",0);
    }

    public OOPs(String color, int door){
        this("Name", "Model", color, door);
    }

    // method implementation
    public void move(){
        System.out.println("the car" + this.name+"is moving");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void stop(){
        System.out.println("The car " + this.name + "has stopped");
    }
}
