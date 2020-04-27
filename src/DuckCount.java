import java.util.ArrayList;
import java.util.Arrays;

public class DuckCount {
    private int size;
    private static int countDuck = 0;
    private int count;

    public DuckCount(){
        countDuck++;
        System.out.println("Создано уток: "+countDuck);
        count = countDuck;

    }

    public void setSize(int duckSize) {
        size = duckSize;
    }

    public int getSize(){
        return size;
    }

    public int getCountDuck(){
        return count;
    }


    public static void main(String[] args) {

        DuckCount[] duckList = new DuckCount[4];

        //first method of duck creation
        DuckCount duck1 = new DuckCount();
        DuckCount duck2 = new DuckCount();
        DuckCount duck3 = new DuckCount();
        DuckCount duck4 = new DuckCount();
        duck1.setSize(10);
        duck2.setSize(20);
        duck3.setSize(30);
        duck4.setSize(40);

        System.out.println("Размер "+duck1.getCountDuck()+"-ой утки  равен "+duck1.getSize());
        System.out.println("Размер "+duck2.getCountDuck()+"-ой утки  равен "+duck2.getSize());
        System.out.println("Размер "+duck3.getCountDuck()+"-ой утки  равен "+duck3.getSize());
        System.out.println("Размер "+duck4.getCountDuck()+"-ой утки  равен "+duck4.getSize());

        System.out.println("\n");

        //second method of duck creation
        for (int i=0; i<4; i++) {
            duckList[i] = new DuckCount();
            duckList[i].setSize((i+1)*10);
        }
        for (DuckCount d : duckList) {
           // int du = Arrays.asList(duckList).indexOf(d); // вот так можно найти индекс в массиве объектов, с примитивами так не прокатит.
           // System.out.println("index = "+du);
            System.out.println("Размер "+d.getCountDuck()+"-ой утки  равен "+d.getSize());
        }

        System.out.println("\n");

        //third method of duck creation
        ArrayList<DuckCount> ducksArLi = new ArrayList<>();
        for (int i=0 ; i<4 ; i++) {
            DuckCount duck= new DuckCount();
            duck.setSize((i+1)*10);
            ducksArLi.add(duck);
        }
        for (DuckCount du : ducksArLi){
            System.out.println("Размер "+du.getCountDuck()+"-й утки равен "+du.getSize());
        }
        System.out.println(DuckCount.countDuck+" ducks were created");
    }

}
