package com.example.designpatternsexercise.demo.iterator;

public class NetEaseMusic1 {
    private IList2 songList;

    public NetEaseMusic1() {
        songList = new SongList2(3);
        songList.add(new Song("让我留在你身边", "陈奕迅"));
        songList.add(new Song("你曾是少年", "SHE"));
        songList.add(new Song("Perfect", "Ed Sheeran"));
    }

    public void listenToMusicByLoop() {
        IIterator iterator = songList.iterator();
        while (iterator.hasNext()) {
            System.out.println("听歌:" + ((ISong) iterator.next()).getSongInfo());
        }
    }
}
