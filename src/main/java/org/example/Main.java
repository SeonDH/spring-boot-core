package org.example;

//TODO-1 main 에서 직접 Shape 를 객체를 생성하지 않고, ShapeFactory 에 객체 생성을 위임한다.
public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("CIRCLE");

        shape1.draw();

        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        shape2.draw();

        Shape shape3 = shapeFactory.getShape("SQUARE");

        shape3.draw();
    }
}