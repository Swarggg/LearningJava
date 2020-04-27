public class TestFormats {
    public static void main(String[] args) {
        String s = String.format("Мне нужно округлить число %,.3f. Да, вот так.", 1100.456550);
        System.out.println(s);
    }
}
