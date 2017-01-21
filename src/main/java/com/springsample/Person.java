package com.springsample;

import org.springframework.stereotype.Component;

/**
 * Created by shekerama on 2017-01-21.
 */
@Component
class Person {
    private final String name = "Seba";

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
