package com.bhaskarmantralahub.jiraintegration;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtil {

    public static String getCurrentDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        ZoneId zone = ZoneId.of("America/Denver");
        ZonedDateTime date = ZonedDateTime.now(zone);
        return date.format(formatter);
    }

}
