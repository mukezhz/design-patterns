package org.example.injector;

import org.example.consumer.Consumer;

/**
 * @Author mukezhz
 * @Date 6/19/23
 */
public interface MessageServiceInjector {
    Consumer getConsumer();
}
