package com.binco.factory.func;

public class ProductManagerFactory  implements Factory {

    public ProductManagerFactory() {
    }

    @Override
    public int getAverageSalary() {
        return 6000;
    }
}
