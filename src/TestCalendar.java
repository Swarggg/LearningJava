import java.util.Calendar;

public class TestCalendar {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        cal.set(2020,0,1,21,0,0);
        long day0 = cal.getTimeInMillis();
        day0 +=1000*60*60; //+1 hour (+=...  same as  day0=day0+...)

        cal.setTimeInMillis(day0); // update time
        System.out.println("plus one hour: "+cal.get(cal.HOUR_OF_DAY));

        cal.add(cal.DATE, 32);
        System.out.println("add 32 days: "+cal.getTime());

        cal.roll(cal.DATE, 32);
        System.out.println("Roll time for 32 days: "+cal.getTime());

        cal.set(cal.DATE, 1);
        System.out.println("Set day in 1: "+cal.getTime()); 

    }

}
