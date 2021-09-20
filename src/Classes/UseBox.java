package Classes;

import Classes.Box;

public class UseBox{
    public static void main(String args[]) {

        //Create object of class this way
        Box a = new Box();
        Box b = new Box();
        Box c;
        c = b;
        double volume1, volume2;

        //Assign Values
        a.depth = 10;
        a.height = 10;
        a.weight = 10;
        a.width = 10;

        b.depth = 9;
        b.height = 10;
        b.weight = 8;
        b.width = 8;

        volume1 = a.volume();
        volume2 = b.volume();

        System.out.println("Volume " + volume1);
        System.out.println("Volume " + volume2);
    }
}