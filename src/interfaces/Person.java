package interfaces;

public class Person implements Infi {

    //публичные переменные
    public String name;

    //Конструкторы
    public Person(String name){
        this.name=name;
    }

    //методы
    public void sayHello () {
        System.out.println("Hello");
    }

    public void showInfo() {
        System.out.println("Name is "+this.name);
    }
}
