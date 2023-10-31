package com.vivid.stdlib;

public class _012FunctionlInterface {

    @FunctionalInterface
    public interface JavaInterface {
        void invoke();

        default String sayHello() {
            return "Hello world J";
        }
    }
}


