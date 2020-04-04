public class KeyWordThis {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setName("Boris");
        human1.setAge(34);
        human1.getInfo();
    }
}

class Human {
    private String name;
    private int age;

    //setters
   public void setName (String name) {
        this.name = name;
    }
   public void setAge (int age) {
        this.age = age;
    }

    //getters
    public String getName () {
        return name;
    }
    public int getAge () {
        return age;
    }

    //methods
    public void getInfo () {
        System.out.println("Человека зовут "+getName()+", ему "+getAge()+" лет.");
    }
}