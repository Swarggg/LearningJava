package interfaces;

public class Animal implements Infi {
    public int id;

    public Animal (int id) {
        this.id=id;
    }

    public void sleep (){
        System.out.println("I`m sleeping");
    }

    public void showInfo() {
        System.out.println("Id is "+this.id);
    }
}
