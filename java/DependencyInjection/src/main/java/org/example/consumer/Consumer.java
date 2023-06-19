package org.example.consumer;

/**
 * @Author mukezhz
 * @Date 6/19/23
 */
public interface Consumer {
    void processMessages(String msg, String rec);
}
