package com.binco.factory.abstr;

import com.binco.factory.Desinger;
import com.binco.factory.Position;
import com.binco.factory.ProductManager;
import com.binco.factory.Programmer;

public  class PositionFactory  extends AbstractFactory{

    @Override
    public Position getDesinger() {
        return new Desinger();
    }

    @Override
    public Position getProductManager() {
        return new ProductManager();
    }

    @Override
    public Position getProgrammer() {
        return new Programmer();
    }
}
