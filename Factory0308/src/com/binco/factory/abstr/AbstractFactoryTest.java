package com.binco.factory.abstr;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        PositionFactory positionFactory = new PositionFactory();
        System.out.println(positionFactory.getDesinger());
    }
}
