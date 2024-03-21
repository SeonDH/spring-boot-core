package org.example.customcode.strategy;

import org.example.customcode.farewell.Farewell;
import org.example.customcode.greeting.Greeting;
import org.example.customcode.sender.Request;
import org.example.customcode.sender.Sender;
import org.example.framework.annotations.Part;
import org.example.framework.factory.Factory;
import org.example.framework.strategy.Steps;


//TODO-3 사용자는 initialize(), process(), destroy() 만 구현하면 되고 호출 여부 혹은 순서를 걱정할 필요가 없다.
@Part
public class Communication implements Steps {

    private final Sender sender;
    private final Greeting greeting;
    private final Farewell farewell;

    // TODO-4 Communication 에서는 인터페이스 정보만 가지고 해당 인터페이스를 요청한다.
    //  인터페이스의 구현체가 바뀌어도 Communication 코드의 수정은 필요 없다.
    public Communication() throws Exception {
        this.sender = Factory.getInstance(Sender.class);
        this.greeting = Factory.getInstance(Greeting.class);
        this.farewell = Factory.getInstance(Farewell.class);
    }


    public void initialize() {
        greeting.sayHello();

    }

    public void process() {
        Request request = new Request("sando", "hello");
        sender.sendMessage(request);
    }

    public void destroy() {
        farewell.sayGoodBye();
    }
}
