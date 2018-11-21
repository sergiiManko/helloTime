package hello.service;

import org.junit.Assert;
import org.junit.Test;

public class MessageServiceTest {
    private MessageService messageService = new MessageService();

    @Test
    public void getMessageNotNull() {
        String message = messageService.getMessage();
        Assert.assertFalse(message.isEmpty());
    }
}