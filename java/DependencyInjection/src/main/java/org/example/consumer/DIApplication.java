package org.example.consumer;

import org.example.service.MessageService;

/**
 * @Author mukezhz
 * @Date 6/19/23
 */
public class DIApplication implements Consumer {

    private MessageService service;

    public DIApplication(MessageService service) {
        this.service = service;
    }

    public void setService(MessageService service) {
        this.service = service;
    }

    @Override
    public void processMessages(String msg, String rec) {
        this.service.sendMessage(msg, rec);
    }
}
