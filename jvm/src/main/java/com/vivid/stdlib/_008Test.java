package com.vivid.stdlib;

public class _008Test {
    public static void main(String[] args) {
        ClassA a = ClassA.Factory.create();
        ClassB b = ClassB.Companion.create();


        ClassC c1 = ClassC.myClass;
        ClassC c2 = ClassC.create();
    }
}
