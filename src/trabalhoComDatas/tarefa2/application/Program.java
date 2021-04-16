package trabalhoComDatas.tarefa2.application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Program {
    public static void main(String[] args){
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        sdf1.setTimeZone(TimeZone.getTimeZone("GMT"));
        System.out.println(sdf1.format(date));

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int minutes = calendar.get(Calendar.MINUTE);
        int month = calendar.get(Calendar.MONTH);
        date = calendar.getTime();
        System.out.println(sdf1.format(date)+" "+calendar.get(Calendar.MONTH)+" "+calendar.get(Calendar.MINUTE));

    }

}
