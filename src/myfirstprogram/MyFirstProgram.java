package myfirstprogram;

import testobject.*;

public class MyFirstProgram {

    public static void main(String[] args) {
//        Computer comp = new Computer("IBM",2048,350,5);
//        Computer comp1 = new Computer("WWW",3096,999,4);


//        comp.setName("IBM");
//        comp.setRam(2048);
//        comp.setHdd(350);
//        comp.setWeight(5);

//        comp.on();
//        comp.load();
//        comp.reset();
//        comp.readCD();
//        comp.off();
//
//        comp1.on();
//        comp1.load();
//        comp1.reset();
//        comp1.readCD();
//        comp1.off();

//        Notebook notebook = new Notebook("Ксиоми",1000,4096,3);
//
//        notebook.on();
//        notebook.load();
//        notebook.off();
        Asus asus1 = new Asus("Асус м1",222, 2222,2);
        asus1.on();
        asus1.load();
        asus1.off();

        Asus asus2 = new Asus("Асус м2",333, 3333,3);
        asus2.on();
        asus2.load();
        asus2.off();

        Toshiba toshiba1 = new Toshiba("Тошиба м1",444,4444,4);
        toshiba1.on();
        toshiba1.load();
        toshiba1.burndvd();
        toshiba1.off();

        Toshiba toshiba2 = new Toshiba("Тошиба м2",555,5555,5);
        toshiba2.on();
        toshiba2.load();
        toshiba2.blueraw();
        toshiba2.off();

        Printer xerox = new Printer("Xerox", 30, 5);
        xerox.printer_On();


    }
}
