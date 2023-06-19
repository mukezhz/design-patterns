package org.example.service;

/**
 * @Author mukezhz
 * @Date 6/19/23
 */
public class EmailService implements MessageService {
    @Override
    public void sendMessage(String msg, String rec) {
        System.out.println("Email sent to " + rec + " with Message=" + msg);
    }
}
