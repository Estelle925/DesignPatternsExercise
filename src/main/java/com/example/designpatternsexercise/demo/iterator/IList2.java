package com.example.designpatternsexercise.demo.iterator;

public interface IList2 {

    IIterator iterator();

    void add(Object object);

    Object get(int index);

    int size();
}
