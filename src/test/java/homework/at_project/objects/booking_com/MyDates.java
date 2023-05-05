package homework.at_project.objects.booking_com;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MyDates {

    public String thirdDay() {
        SimpleDateFormat needFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar myCalendar = Calendar.getInstance();
        myCalendar.setTime(new Date());
        myCalendar.add(Calendar.DAY_OF_MONTH, 3);
        return needFormat.format(myCalendar.getTime());
    }

    public String tenthDay() {
        SimpleDateFormat needFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar myCalendar = Calendar.getInstance();
        myCalendar.setTime(new Date());
        myCalendar.add(Calendar.DAY_OF_MONTH, 10);
        return needFormat.format(myCalendar.getTime());
    }

}
