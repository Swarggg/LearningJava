public class ArraysTraning {
    public static void main (String[] args) {
        int[] apartmentsPayed = new  int[100];
        apartmentsPayed[23] = 700;
        apartmentsPayed[22] = 600;
        apartmentsPayed[45] = 100;
        apartmentsPayed[67] = 800;
        for (int i=0; i<apartmentsPayed.length; i++) {        // в apartmentsPayed.length часть .length вычисляет длину массива
            if (apartmentsPayed[i]>0) {

                System.out.println("Apart #" + i + " payed \t$" + apartmentsPayed[i]);
            }
        }
    }
}