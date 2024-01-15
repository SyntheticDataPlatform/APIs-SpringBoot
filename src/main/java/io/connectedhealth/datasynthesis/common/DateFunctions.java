package io.connectedhealth.datasynthesis.common;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Date;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class DateFunctions {
    public static String returnDateTime()
    {
        String dateReturn = null;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
        dateReturn = dtf.format(now);
        return dateReturn;
    }
}
