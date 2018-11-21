package hello;

import hello.service.MessageService;

import java.time.LocalTime;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        MessageService helloWorld = new MessageService();
        System.out.printf(helloWorld.getMessage(LocalTime.now(), Locale.getDefault()));
    }
}
