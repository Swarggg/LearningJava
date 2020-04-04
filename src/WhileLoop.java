public class WhileLoop {
   public static void main(String[] args) {
       int items = 30;
       int magValue = 30;
       while (items > 0) {
           System.out.println("In mag: " + items+"/"+magValue);
           items = items - 1;
       }
   }
}
