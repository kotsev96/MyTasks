package JavaRush9;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

class Hard8 {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
            Date d = formatter.parse(reader.readLine());


            SimpleDateFormat formatter2 = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
            System.out.println(formatter2.format(d).toUpperCase());
        }catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
