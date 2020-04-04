import java.util.Scanner;

public class TransportCost {
    public static void main (String[] args) {
        Scanner inputData = new Scanner(System.in);
        System.out.println("Input cargo mass (kg): ");
        int mass = inputData.nextInt();

        System.out.println("Input distance (km): ");
        int distance= inputData.nextInt();

        int cost = mass*100+distance*10;
        System.out.println("Transport cost is: "+cost);
    }
}
