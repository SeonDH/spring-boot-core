package org.example;

public class SingleObject {

    // TODO-2 객체를 하나 생성한다.
    private static final SingleObject instance = new SingleObject();

    // TODO-1 생성자를 private 으로 만들어서, 객체를 외부에서 생성할 수 없게한다.
    private SingleObject() {
    }

    // TODO-3 생성된 객체를 외부에서 접근해서 유일한 객체를 사용.
    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }

    // TODO-4 hashCode 를 통해, 같은 객체인 것을 확인할 수 있다.
    public void showHashCode() {
        System.out.println(this.hashCode());
    }

}