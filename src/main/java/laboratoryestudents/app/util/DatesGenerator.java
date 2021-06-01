package laboratoryestudents.app.util;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;

public class DatesGenerator {
    public Integer  TOTAL_DAYS_WEEK =7;
    public int SATURDAY = 7;
    public int currentDay;

    public DatesGenerator(){

    }

        public  List<Date> generate(List<Date> dates){


        Calendar cal = Calendar.getInstance();
        this.currentDay = cal.get(Calendar.DAY_OF_WEEK);

        //check if is not saturday(7)
        if (this.currentDay != this.SATURDAY) {
            //backward number of days to start on Saturday
            cal.add(Calendar.DATE, -this.currentDay);
        }

        Date sqlDate = new Date(cal.getTimeInMillis());
        dates.add(sqlDate);

        for (int i =1 ; i< this.TOTAL_DAYS_WEEK ; i++) {
            cal.setTime(sqlDate);
            cal.add(Calendar.DATE, 1);
            sqlDate = new Date(cal.getTimeInMillis());
            dates.add(sqlDate);
        }
        return dates;
    }
}
