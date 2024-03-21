package org.example;

public class Main {
    public static void main(String[] args) {


        // TODO-5 외부에서 객체 생성이 불가능한 걸 확인한다.
        // SingleObject object = new SingleObject();

        // TODO-6 객체의 hashCode 가 일치하는 걸 확인한다.
        SingleObject object1 = SingleObject.getInstance();

        object1.showMessage();
        object1.showHashCode();

        SingleObject object2 = SingleObject.getInstance();

        object2.showMessage();
        object2.showHashCode();


    }
}