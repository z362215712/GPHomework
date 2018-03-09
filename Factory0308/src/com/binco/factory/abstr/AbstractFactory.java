package com.binco.factory.abstr;

import com.binco.factory.Position;

public abstract class AbstractFactory {
    public abstract Position getDesinger();

    public abstract Position getProductManager();
    public abstract Position getProgrammer();
}
