public class Constructor {
    public static void main(String[] args) {
        HumanInConstr worker1 = new HumanInConstr("Boris", 24);


    }
}

class HumanInConstr {
    private String name;
    private int age;

    public static String description; //статическая переменная класса HumanInConstr

    public HumanInConstr (String name, int age) {                 //конструктор класса
        this.name = name;
        this.age = age;
    }

    //setters
    public void setName (String name) {
        this.name = name;
    }
    public void setAge (int age) {
        this.age = age;
    }

    //getters
   /*public String getName () {
        return name;
    }
    public int getAge () {
        return age;
    }

    //methods
    public void getInfo () {
        System.out.println("Человека зовут "+getName()+", ему "+getAge()+" лет.");
     } */
}