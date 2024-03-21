package org.example.shell;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

//TODO-1 @ShellComponent 붙이기
@ShellComponent
public class MyCommands {

    //TODO-1 @ShellMethod. 메소드명 + 인자 = 명령어
    @ShellMethod
    public String greet(String name) {
        return "Hello, " + name;
    }

    @ShellMethod
    public String farewell(String name) {
        return "Bye, " + name;
    }
}
