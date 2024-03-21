package org.example.runner;

import lombok.RequiredArgsConstructor;
import org.example.sender.MessageSender;
import org.example.sender.Request;

@RequiredArgsConstructor
public class ContextRunner {

    private final MessageSender messageSender;

    public void run() {
        Request request = new Request("sando", "hello");
        messageSender.sendMessage(request);
    }
}