package com.aio.tests.ui;

import org.testng.annotations.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;

public class UILoginTests {

    @Test(groups = "SCRUM-TC-2091", description = "test duration update")
    public void testDurationUpdate()  {
        try {
            Thread.sleep(6010);

             String ISO_8601_24H_FULL_FORMAT = "yyyy-MM-dd'T'HH:mm:ss z";
                        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern(ISO_8601_24H_FULL_FORMAT);
            String date = "2020-07-08T16:31:13 IST";
            LocalDateTime dt = LocalDateTime.parse(date, formatter1);
            DateFormat parseFormat = new SimpleDateFormat("M/dd/yyyy HH:mm:ss XXX");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    @Test(groups = "SCRUM-TC-1617")
    public void test2() throws ParseException {
        String date = "2020-07-08T16:31:13 IST";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss z");
        System.out.println(sdf.parse(date).toInstant());
//        sdf.parse()
    }
}
