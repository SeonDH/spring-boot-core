package org.example.strategy;

import org.example.farewell.EnglishFarewell;
import org.example.farewell.Farewell;
import org.example.greeting.EnglishGreeting;
import org.example.greeting.Greeting;
import org.example.sender.ConsoleSender;
import org.example.sender.Request;
import org.example.sender.Sender;


public class Communication implements Steps {

    private final Greeting greeting;
    private final Farewell farewell;
    private final Sender sender;

    //TODO-2 EnglishGreeting, EnglishFarewell, ConsoleSender 과 강결합이 되어있어서 해당 클래스의 변경이 필요하면 Communication 코드의 변경이 필요하다.
    //TODO-3 Communication 클래스를 테스트하려면 의존성이 있는 모든 객체를 구현해야한다.
    public Communication() {
        this.greeting = new EnglishGreeting();
        this.farewell = new EnglishFarewell();
        this.sender = new ConsoleSender();
    }


    @Override
    public void initialize() {
        greeting.sayHello();
    }

    @Override
    public void process() {
        Request request = new Request("sando", "hello");
        sender.sendMessage(request);
    }

    @Override
    public void destroy() {
        farewell.sayGoodBye();
    }
}
