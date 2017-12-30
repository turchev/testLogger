package com.mycompany.testlogger;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Helper {

    private static final Logger log = LoggerUtil.getLogger(Helper.class);

    public static void printLoggerEntry() {

        Date date = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("E yyyy.MM.dd 'time' hh:mm:ss a zzz");

        log.log(Level.SEVERE, "{0}: Message level: SEVERE", formatForDateNow.format(date));

        if (log.isLoggable(Level.FINE)) {
            log.log(Level.FINE, "{0}: Message level: FINE", formatForDateNow.format(date));
        }

    }
}
