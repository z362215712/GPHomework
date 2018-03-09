package com.binco.factory.func;

public class FactoryTest {
    public static void main(String[] args) {
        Factory factory = new DesignerFactory();
        System.out.println(factory.getAverageSalary());
    }
}
