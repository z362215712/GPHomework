package com.binco.factory.simple;

import com.binco.factory.Desinger;
import com.binco.factory.Position;
import com.binco.factory.ProductManager;
import com.binco.factory.Programmer;

public class SimpleFactory {
    public Position getPosition(String positionName) {
        switch (positionName) {
            case "Designer":
                return new Desinger();
            case "ProductManager":
                return new ProductManager();

            case "Programmer":
                return new Programmer();
            default:
                System.out.println("无该职位");
                return null;
        }


    }
}
