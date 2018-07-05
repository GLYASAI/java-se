package org.abewang.javase.generic;//: generics/FactoryConstraint.java

interface FactoryI<T, U> {
    T create(U u);
}

class Foo2<T, U> {
    private T x;

    public <F extends FactoryI<T, U>> Foo2(F factory, U u) {
        x = factory.create(u);
    }
    // ...
}

class IntegerFactory implements FactoryI<Integer, Integer> {
    public Integer create(Integer arg) {
        return 0;
    }
}

class Widget {
    private String name;

    public Widget(String name) {
        this.name = name;
    }

    public static class Factory implements FactoryI<Widget, String> {
        public Widget create(String name) {
            return new Widget(name);
        }
    }
}

public class FactoryConstraint {
    public static void main(String[] args) {
        Foo2 i = new Foo2<>(new IntegerFactory(), 7);
        Foo2 w = new Foo2<>(new Widget.Factory(), "test");
    }
} ///:~
