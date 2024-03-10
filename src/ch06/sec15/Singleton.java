package ch06.sec15;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Collections.reverseOrder;

public class Singleton {

    private final static Singleton singleton = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return singleton;
    }


}
