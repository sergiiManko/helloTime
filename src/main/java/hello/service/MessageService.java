package hello.service;

import org.apache.log4j.Logger;

import java.nio.charset.StandardCharsets;
import java.time.LocalTime;
import java.util.Locale;
import java.util.ResourceBundle;

public class MessageService {
    private static final LocalTime SIX_HOURS = LocalTime.of(6, 0);
    private static final LocalTime NINE_HOURS = LocalTime.of(9, 0);
    private static final LocalTime NINETEEN_HOURS = LocalTime.of(19, 0);
    private static final LocalTime TWENTY_THREE_HOURS = LocalTime.of(23, 0);
    private static final Logger log = Logger.getLogger(MessageService.class);

    public String getMessage(LocalTime timeNow, Locale locale) {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("messageResource", locale);
        String message;
        if (timeNow.isAfter(SIX_HOURS) && timeNow.isBefore(NINE_HOURS)) {
            log.info("Added message in the morning");
            message = resourceBundle.getString("morning");
        } else if (timeNow.isAfter(NINE_HOURS) && timeNow.isBefore(NINETEEN_HOURS)) {
            log.info("Added message in the day");
            message = resourceBundle.getString("day");
        } else if (timeNow.isAfter(NINETEEN_HOURS) && timeNow.isBefore(TWENTY_THREE_HOURS)) {
            log.info("Added message in the evening");
            message = resourceBundle.getString("evening");
        } else {
            log.info("Added message in the night");
            message = resourceBundle.getString("night");
        }
        return new String(message.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);
    }
}
