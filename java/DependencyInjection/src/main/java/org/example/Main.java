package org.example;

import org.example.consumer.Consumer;
import org.example.injector.EmailServiceInjector;
import org.example.injector.MessageServiceInjector;

/**
 * @Author mukezhz
 * @Date 6/19/23
 */
public class Main {
    public static void main(String[] args) {
        // create an injector which injects the dependency ie: does all the creation stuffs
        // this one is only directly dependent
        MessageServiceInjector messageService = new EmailServiceInjector();
        Consumer consumer = messageService.getConsumer();
        consumer.processMessages("This is messsage via email", "Receiver");
    }
}