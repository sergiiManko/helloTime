package hello.service;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalTime;
import java.util.Locale;

public class MessageServiceTest {
    private MessageService messageService = new MessageService();

    @Test
    public void getMessageNotNull() {
        String message = messageService.getMessage(LocalTime.now(), Locale.getDefault());
        Assert.assertFalse(message.isEmpty());
    }

    @Test
    public void getMessageMorningRU() {
        LocalTime time = LocalTime.of(7, 10);
        Locale locale = new Locale("ru", "RU");
        String actual = "Доброе утро, Мир!";
        String expected = messageService.getMessage(time, locale);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getMessageDayRU() {
        LocalTime time = LocalTime.of(11, 10);
        Locale locale = new Locale("ru", "RU");
        String actual = "Добрый день, Мир!";
        String expected = messageService.getMessage(time, locale);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getMessageEveningRU() {
        LocalTime time = LocalTime.of(20, 10);
        Locale locale = new Locale("ru", "RU");
        String actual = "Добрый вечер, Мир!";
        String expected = messageService.getMessage(time, locale);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getMessageNightRU() {
        LocalTime time = LocalTime.of(4, 10);
        Locale locale = new Locale("ru", "RU");
        String actual = "Доброй ночи, Мир!";
        String expected = messageService.getMessage(time, locale);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getMessageMorningEN() {
        LocalTime time = LocalTime.of(7, 10);
        Locale locale = Locale.ENGLISH;
        String actual = "Good morning, World!";
        String expected = messageService.getMessage(time, locale);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getMessageDayEN() {
        LocalTime time = LocalTime.of(11, 10);
        Locale locale = Locale.ENGLISH;
        String actual = "Good day, World!";
        String expected = messageService.getMessage(time, locale);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getMessageEveningEN() {
        LocalTime time = LocalTime.of(20, 10);
        Locale locale = Locale.ENGLISH;
        String actual = "Good evening, World!";
        String expected = messageService.getMessage(time, locale);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getMessageNightEN() {
        LocalTime time = LocalTime.of(4, 10);
        Locale locale = Locale.ENGLISH;
        String actual = "Good night, World!";
        String expected = messageService.getMessage(time, locale);
        Assert.assertEquals(expected, actual);
    }
}