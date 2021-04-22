import java.util.Scanner;

public class arrays2 {
    public static void main(String[] args) {
        int arr1[] = new int[] {1,2,3,4,5,6,7,8,9};

        System.out.println("Исходный массив:");
        for (int i=0; i<arr1.length; ++i) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
       // int nomerElementa;

        System.out.print("Введите цифру, которую надо удалить: ");
        Scanner a = new Scanner (System.in);
        int nomerElementa= Integer.parseInt(a.nextLine());

        for (int i=nomerElementa-1; i<arr1.length-1; i++) {

            arr1[i] = arr1[i + 1];
        }

        System.out.println(" ");
        System.out.println("Полученный массив без "+nomerElementa+":");
        for (int i = 0; i<arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }





    }

}
