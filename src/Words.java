import java.util.Scanner;

public class Words {


    public static void main (String[] args) {
        //String someWords = "bull cow home";

        System.out.println("We have some words: " + getSomeWords());
        System.out.println ("what word will search:");

        Scanner fromConsole = new Scanner(System.in);

        String xxx = fromConsole.nextLine();

        System.out.println(getSomeWords().indexOf(xxx));
    }

    public static String getSomeWords () {
        return "bull cow home";
    }

}
