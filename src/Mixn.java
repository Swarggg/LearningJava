public class Mixn {
    int counter = 0;

    public static void main(String[] args) {
        int count = 0;
        Mixn[] m4a=new Mixn[20];
        int x = 0;
        while (x<9) {
            m4a[x]= new Mixn();
            m4a[x].counter = m4a[x].counter+1;
            count=count+1;
            count= count + m4a[x].maybeNew(x);
            x = x +1;
        }
    System.out.println(count + " "+m4a[1].counter);

    }

    public int maybeNew (int index) {
        int x = 0;
        if (index<5) {
            Mixn m4 = new Mixn();
            m4.counter=m4.counter+1;
            return 1;
        }
        return 0;
    }


}
