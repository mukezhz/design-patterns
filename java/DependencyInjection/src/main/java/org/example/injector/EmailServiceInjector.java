package org.example.injector;

import org.example.consumer.Consumer;
import org.example.consumer.DIApplication;
import org.example.service.EmailService;

/**
 * @Author mukezhz
 * @Date 6/19/23
 */
public class EmailServiceInjector implements MessageServiceInjector{
    @Override
    public Consumer getConsumer() {
        return new DIApplication(new EmailService());
    }
}
