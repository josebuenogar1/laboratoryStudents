package laboratoryestudents.app.util;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;

public class DatesGenerator {


        public static List<Date> generate(List<Date> dates){
        Integer  TOTAL_DAYS_WEEK =7;
        int SATURDAY = 7;
        int currentDay;

        Calendar cal = Calendar.getInstance();
        currentDay = cal.get(Calendar.DAY_OF_WEEK);

        //check if is not saturday(7)
        if (currentDay != SATURDAY) {
            //backward number of days to start on Saturday
            cal.add(Calendar.DATE, -currentDay);
        }

        Date sqlDate = new Date(cal.getTimeInMillis());
        dates.add(sqlDate);

        for (int i =1 ; i< TOTAL_DAYS_WEEK ; i++) {
            cal.setTime(sqlDate);
            cal.add(Calendar.DATE, 1);
            sqlDate = new Date(cal.getTimeInMillis());
            dates.add(sqlDate);
        }
        return dates;
    }
}
