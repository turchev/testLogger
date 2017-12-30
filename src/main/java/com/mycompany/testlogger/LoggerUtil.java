package com.mycompany.testlogger;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public final class LoggerUtil {

    private static final String LOGGING_PROPERTIES = "logging.properties";

    static {
        loadFromProperties();
    }

    private LoggerUtil() {
        throw new AssertionError();
    }

    private static void loadFromProperties() {

        InputStream stream;
        
        try {
            stream = new FileInputStream(LOGGING_PROPERTIES);
            LogManager.getLogManager().readConfiguration(stream);
        } catch (FileNotFoundException ex) {
            System.err.println("Logger property file not found: " + ex.toString());
        } catch (IOException | SecurityException ex) {
            System.err.println("The log is not configured: " + ex.toString());
        }

    }

    public static Logger getLogger(Class<?> clazz) {
        return Logger.getLogger(clazz.getName());
    }
}
