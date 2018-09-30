package testobject;

import javafx.scene.control.RadioMenuItem;

public class Computer {

    public String name;

    public int ram;

    public int hdd;

    public int weight;

        public Computer(){
//            System.out.println("Computer : конструктор");

        }

        public Computer(String name, int ram, int hdd, int weight){
            this.name = name;
            this.ram = ram;
            this.hdd = hdd;
            this.weight = weight;
        }



    public String getName(){
        return name;
    }
    public void setName(String newName){
        name = newName;
    }

    public int getRam(){
        return ram;
    }

    public  void setRam(int newRam) {
        if (newRam > 0) {
            ram = newRam;
        } else {
            System.out.println("Переданное значение " + newRam + " не может быть отрицательным");
        }
    }
    public int getHdd(){
        return hdd;
    }

    public  void setHdd(int newHdd) {
        if (newHdd > 0) {
            hdd = newHdd;
        } else {
            System.out.println("Переданное значение " + newHdd + " не может быть отрицательным");
        }
    }
    public int getWeight(){
        return weight;
    }

    public  void setWeight(int newWeight) {
        if (newWeight > 0) {
            weight = newWeight;
        } else {
            System.out.println("Переданное значение " + newWeight + " не может быть отрицательным");
        }
    }
        public void on () {
            print("я включился. Моя модель " + getName());
        }

        public void off() {
            print("я выключился ");
            print("");
        }

        public void load() {
            print("я загружаюсь. Мой объём жесткого диска равен " + getHdd() + " Гб, количество оперативной памяти "
                    + getRam() + " Гб, мой вес " + getWeight() + " кг" );
        }

        protected void reset (){
            print("я могу перезагружаться");
        }

        protected void readCD () {
            print("я могу читать CD диски");
        }

        protected void print(String str){
            System.out.println(str);
        }
    }
