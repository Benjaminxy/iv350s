package se.kth.iv1350.amazingpos.util;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * Handles logging of errors to a file.
 */
public class LogHandler {

    private static final String LOG_FILE_NAME = "C:\\logs\\pos-log.txt";
    private PrintWriter logFile;

    /**
     * Creates a new LogHandler.
     * 
     * @throws IOException If there is an error opening the log file.
     */
    public LogHandler() throws IOException {
        logFile = new PrintWriter(new FileWriter(LOG_FILE_NAME, true));
    }

    /**
     * Logs an exception to the log file.
     * 
     * @param exception The exception to log.
     */
    public void logException(Exception exception) {
        try {
            StringBuilder logMsgBuilder = new StringBuilder();
            logMsgBuilder.append(createTime());
            logMsgBuilder.append(", Exception was thrown: ");
            logMsgBuilder.append(exception.getMessage());
            logFile.println(logMsgBuilder);
            exception.printStackTrace(logFile);
            logFile.flush();
        } finally {
            if (logFile != null) {
                logFile.close();
            }
        }
    }

    /**
     * Creates a timestamp for the log entry.
     * 
     * @return The current date and time.
     */
    private String createTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        return now.format(formatter);
    }
}
