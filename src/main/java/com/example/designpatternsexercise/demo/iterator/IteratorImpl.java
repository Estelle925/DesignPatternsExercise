package com.example.designpatternsexercise.demo.iterator;

public class IteratorImpl implements IIterator {

    private IList2 list;
    private int index;

    public IteratorImpl(IList2 list) {
        this.list = list;
        this.index = 0;
    }

    @Override
    public Object next() {
        return list.get(index++);
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }
}
