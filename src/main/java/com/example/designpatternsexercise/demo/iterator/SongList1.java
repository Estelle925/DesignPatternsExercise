package com.example.designpatternsexercise.demo.iterator;

public class SongList1 implements IList1 {
    private ISong[] songs;
    private int index;
    private int size;

    public SongList1(int size) {
        songs = new ISong[size];
        index = 0;
        size = 0;
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
