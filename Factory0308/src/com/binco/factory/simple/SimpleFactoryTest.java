package com.binco.factory.simple;

import com.binco.factory.Desinger;
import com.binco.factory.Position;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        SimpleFactory simpleFactory =new SimpleFactory();
        System.out.println(simpleFactory.getPosition("Designer"));
    }
}
