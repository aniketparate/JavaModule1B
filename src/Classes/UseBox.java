package Classes;

import Classes.Box;

public class UseBox{
    public static void main(String args[]) {

        //Create object of class this way
        Box a = new Box(10,10,10,10);
        Box b = new Box(5,10,5,10);

        double volume1, volume2;

        //Assign Values


        volume1 = a.volume();
        volume2 = b.volume();

        System.out.println("Volume " + volume1);
        System.out.println("Volume " + volume2);
    }
}