public class ForEach {
    public static void main(String[] args) {
        int[] massive = {1,2,3,4,5,6,7,4,3,4,5,65,3,45,34,345,345,345,345,34,3556,46,};
        for (int numbers : massive){
            int x=4;
            if (numbers==x) {
                System.out.print("!");
            }
            System.out.print(numbers+" ");
        }
    }


}
