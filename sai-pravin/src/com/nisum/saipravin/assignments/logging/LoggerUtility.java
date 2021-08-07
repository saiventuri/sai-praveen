package com.nisum.saipravin.assignments.logging;

import java.util.logging.Level; 
import java.util.logging.Logger;

/**
 * Utility class used for logging.
 * 
 * @author sai praveen
 *
 */
public class LoggerUtility {
    
    /**
     * Logger instance used by this class for
     * log operations.
     */
    private static final Logger LOGGER =  Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    /**
     * Private constructor as object of this class should never
     * be created.
     */
    private LoggerUtility() {
        super();
    }

    /**
     * Function used to log messages of level 'INFO'.
     * 
     * @param message the message that is to be logged.
     */
    public static void logInfo(String message) {
        LOGGER.log(Level.INFO, message);
    }
}
