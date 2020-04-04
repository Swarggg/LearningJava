import java.util.Scanner;

public class Input {
    public static void main (String[] args) {
        Scanner vvodStroki = new Scanner(System.in);
        System.out.println("Input something");
        String toChtoVveli = vvodStroki.nextLine();
        System.out.println("Vvedeno " + toChtoVveli);
    }
}
