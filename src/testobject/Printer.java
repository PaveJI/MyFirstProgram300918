package testobject;

public class Printer {

    public String name;
    public int speed;
    public int weight;

    public Printer(String name, int speed, int weight){
        this.name = name;
        this.speed = speed;
        this.weight = weight;
    }

    public void printer_On(){
        System.out.println("Принтер вклчился");
    }
}
