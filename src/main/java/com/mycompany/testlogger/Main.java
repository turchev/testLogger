package com.mycompany.testlogger;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    private static final Logger log = LoggerUtil.getLogger(Main.class);

    public static void main(String[] args) {

        Date date = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("E yyyy.MM.dd 'time' hh:mm:ss a zzz");

        for (int i = 0; i < 10; i++) {
            Helper.printLoggerEntry();
            log.log(Level.SEVERE, "{0}: Message level: SEVERE", formatForDateNow.format(date));

            if (log.isLoggable(Level.FINE)) {
                log.log(Level.FINE, "{0}: Message level: FINE", formatForDateNow.format(date));
            }
        }
    }
}
