package JavaRush8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

class Hard10 {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        boolean odd = false;
        try {


            SimpleDateFormat formatter = new SimpleDateFormat("MMMM dd yyyy", Locale.ENGLISH);
            Date date2 = formatter.parse(date);

            GregorianCalendar calendar = new GregorianCalendar();
            calendar.setTime(date2);
            if (calendar.get(Calendar.DAY_OF_YEAR) % 2 == 0)
                odd = false;
            else
                odd = true;
        }
        catch (ParseException e) {
            e.printStackTrace();
        }

        return odd;
    }
}
/*
1. Реализовать метод isDateOdd(String date) так,
 чтобы он возвращал true, если количество дней с
 начала года - нечетное число, иначе false
2. String date передается в формате FEBRUARY 1 2013
Не забудьте учесть первый день года.
 */
