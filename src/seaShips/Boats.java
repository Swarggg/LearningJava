package seaShips;

public class Boats extends Liners {

    public Boats(String name) {
        super(name);
        System.out.println("make Boat "+getName());


    }


    public static void main(String[] args) {
        Boats boat1 = new Boats("Pobeda");
        System.out.println("Go "+boat1.getName());


    }


}