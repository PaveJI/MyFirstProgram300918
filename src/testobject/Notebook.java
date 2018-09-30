package testobject;

public class Notebook extends Computer{

    public Notebook(){
//        System.out.println("Notebook : конструктор");
    }

    public Notebook(String name, int hdd, int ram, int weight) {
        this.name = name;
        this.ram = ram;
        this.hdd = hdd;
        this.weight = weight;
    }

    //@Override
    //public void on () {
        //super.on();
        //print("Notebook : я включился. Моя модель " + getName());
    }


//}
