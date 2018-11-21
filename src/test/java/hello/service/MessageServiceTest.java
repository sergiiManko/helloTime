package hello.service;

import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.time.LocalTime;
import java.util.Locale;
import java.util.ResourceBundle;

public class MessageServiceTest {
    private MessageService messageService = new MessageService();
    private static final String MESSAGE_RESOURCE = "messageResource";

    @Test
    public void getMessageNotNull() {
        String message = messageService.getMessage(LocalTime.now(), Locale.getDefault());
        Assert.assertFalse(message.isEmpty());
    }

    @Test
    public void getMessageMorningRU() {
        LocalTime time = LocalTime.of(7, 10);
        Locale locale = new Locale("ru", "RU");
        ResourceBundle resourceBundle = ResourceBundle.getBundle(MESSAGE_RESOURCE, locale);
        String actual = new String(resourceBundle.getString("morning").getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);
        String expected = messageService.getMessage(time, locale);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getMessageDayRU() {
        LocalTime time = LocalTime.of(11, 10);
        Locale locale = new Locale("ru", "RU");
        ResourceBundle resourceBundle = ResourceBundle.getBundle(MESSAGE_RESOURCE, locale);
        String actual = new String(resourceBundle.getString("day").getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);
        String expected = messageService.getMessage(time, locale);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getMessageEveningRU() {
        LocalTime time = LocalTime.of(20, 10);
        Locale locale = new Locale("ru", "RU");
        ResourceBundle resourceBundle = ResourceBundle.getBundle(MESSAGE_RESOURCE, locale);
        String actual = new String(resourceBundle.getString("evening").getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);
        String expected = messageService.getMessage(time, locale);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getMessageNightRU() {
        LocalTime time = LocalTime.of(4, 10);
        Locale locale = new Locale("ru", "RU");
        ResourceBundle resourceBundle = ResourceBundle.getBundle(MESSAGE_RESOURCE, locale);
        String actual = new String(resourceBundle.getString("night").getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);
        String expected = messageService.getMessage(time, locale);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getMessageMorningEN() {
        LocalTime time = LocalTime.of(7, 10);
        Locale locale = Locale.ENGLISH;
        ResourceBundle resourceBundle = ResourceBundle.getBundle(MESSAGE_RESOURCE, locale);
        String actual = new String(resourceBundle.getString("morning").getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);
        String expected = messageService.getMessage(time, locale);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getMessageDayEN() {
        LocalTime time = LocalTime.of(11, 10);
        Locale locale = Locale.ENGLISH;
        ResourceBundle resourceBundle = ResourceBundle.getBundle(MESSAGE_RESOURCE, locale);
        String actual = new String(resourceBundle.getString("day").getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);
        String expected = messageService.getMessage(time, locale);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getMessageEveningEN() {
        LocalTime time = LocalTime.of(20, 10);
        Locale locale = Locale.ENGLISH;
        ResourceBundle resourceBundle = ResourceBundle.getBundle(MESSAGE_RESOURCE, locale);
        String actual = new String(resourceBundle.getString("evening").getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);
        String expected = messageService.getMessage(time, locale);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getMessageNightEN() {
        LocalTime time = LocalTime.of(4, 10);
        Locale locale = Locale.ENGLISH;
        ResourceBundle resourceBundle = ResourceBundle.getBundle(MESSAGE_RESOURCE, locale);
        String actual = new String(resourceBundle.getString("night").getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);
        String expected = messageService.getMessage(time, locale);
        Assert.assertEquals(expected, actual);
    }
}