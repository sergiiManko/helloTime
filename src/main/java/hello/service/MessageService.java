package hello.service;

import org.apache.log4j.Logger;

import java.nio.charset.StandardCharsets;
import java.time.LocalTime;
import java.util.Locale;
import java.util.ResourceBundle;

public class MessageService {
    private static final Logger log = Logger.getLogger(MessageService.class);

    public String getMessage(LocalTime timeNow, Locale locale) {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("messageResource", locale);
        String message;
        int hour = timeNow.getHour();
        if (6 <= hour && hour < 9) {
            log.info("Added message in the morning");
            message = resourceBundle.getString("morning");
        } else if (9 <= hour && hour < 19) {
            log.info("Added message in the day");
            message = resourceBundle.getString("day");
        } else if (19 <= hour && hour < 23) {
            log.info("Added message in the evening");
            message = resourceBundle.getString("evening");
        } else {
            log.info("Added message in the night");
            message = resourceBundle.getString("night");
        }
        return new String(message.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);
    }
}
