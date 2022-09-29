package com.example.designpatternsexercise.demo.iterator;

public class SongList2 implements IList2 {
    private ISong[] songs;
    private int index;
    private int size;

    public SongList2(int size) {
        songs = new ISong[size];
        index = 0;
        size = 0;
    }

    @Override
    public IIterator iterator() {
        return new IteratorImpl(this);
    }

    @Override
    public void add(Object object) {
        songs[index++] = (ISong) object;
        size++;
    }

    @Override
    public Object get(int index) {
        if (index < size) {
            return songs[index];
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }
}
