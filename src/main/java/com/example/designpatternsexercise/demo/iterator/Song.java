package com.example.designpatternsexercise.demo.iterator;

import lombok.Data;

@Data
public class Song implements ISong{

    private String name;
    private String singer;

    public Song(String name, String singer) {
        this.name = name;
        this.singer = singer;
    }

    @Override
    public String getSongInfo() {
        return this.name + "--" + this.singer;
    }
}
