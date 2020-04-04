package interfaces;

public class Test {
    public static void main(String[] args) {
        //maked objects

        Animal animal1 = new Animal(243);
        Person person1 = new Person("Boris");
        /*
        animal1.showInfo();
        person1.showInfo();
        */
        Infi infi1 = new Animal(21);

        infi1.showInfo();

        OutputInfi(person1);

    }

    public static void OutputInfi (Infi gogo){
        gogo.showInfo();
    }



}
