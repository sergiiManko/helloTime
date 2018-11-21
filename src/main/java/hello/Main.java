package hello;

import hello.service.MessageService;

public class Main {
    public static void main(String[] args) {
        MessageService helloWorld = new MessageService();
        System.out.printf(helloWorld.getMessage());
    }
}
