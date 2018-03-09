package com.binco.factory.func;

public class ProgrammerFactory implements Factory {
    public ProgrammerFactory() {
    }

    @Override
    public int getAverageSalary() {
        return 3000;
    }
}
