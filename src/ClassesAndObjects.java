public class ClassesAndObjects   {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Roma");
        person1.setAge(43);
        //person1.age = 25;
        //int year1 = person1.calcilatrYearsToPensiya();
        person1.speak();
        //System.out.println(person1.name+" до пенсии "+year1+" лет.");

    }
}

class Person {
    private  String name;
    private int age;

    public void setName (String username){
        name = username;
    }
    public void setAge (int ageOfUser){
        age= ageOfUser;
    }


    public String getName (){
        return name;
    }
    public int getAge (){
        return age;
    }



    void setNameAndAge(String username, int ageOfPerson){
        name = username;
        age = ageOfPerson;
    }

    void speak(){
        System.out.println("My name is "+getName()+", my age is "+getAge());
    }

   int calcilatrYearsToPensiya(){
        int years= 65-age;
        //System.out.println("Количество лет до пенсии "+years);
        return years;
    }
}
