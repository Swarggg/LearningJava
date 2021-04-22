import java.util.Date;

public class TestFormats {
    public static void main(String[] args) {
        double a = 1100.456550;
        String s = String.format("Мне нужно округлить число "+a+" до %,.3f. Да, вот так.", a);
        System.out.println(s);

        String d = String.format("%tc", new Date());
        System.out.println(d);

        String t = String.format("%tr", new Date());
        System.out.println(t);

        Date td = new Date();
        String today = String.format("%tA, %td %tB %tY %<tH:%<tM", td, td, td, td); // знак < заставлет использовать предыдущий аргумент td
        System.out.println(today);

    }
}
