package SLTB_sachin;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import SLTB_sachin.panel.sendingemail;

public class clockThread extends Thread {

    Temp dc;
    String time;
    sendingemail se;
    int i = 1;
    String b;
    String a;

    public clockThread(Temp dc) {
        this.dc = dc;

        se = sendingemail.getobj();
        b = "00";
        start();
    }

    public void run() {
        while (true) {
            a = "";
            Date date = new Date();
            String Sdf = "HH:mm:ss";
            DateFormat dateFormat = new SimpleDateFormat(Sdf);
            String formttedDate = dateFormat.format(date);
            dc.clock123.setText(formttedDate);
            String sec = "ss";
            DateFormat seFormat = new SimpleDateFormat(sec);
            String seformttedDate = seFormat.format(date);
            //System.out.println(seformttedDate);
            if (!seformttedDate.equalsIgnoreCase(b)) {
                b = seformttedDate;
                for (int j = 1; j <= i; j++) {
                    a += "*";

                }
                i++;
                //System.out.println(a);
                se.dis1.setText(a);
                if (i > 25) {
                    i = 1;
                }
            }

        }
    }
}
