package com.example.designpatternsexercise.demo.observable;

public class ObserverTest {
    public static void main(String[] args) {
        User xiaoMing = new User("小明");
        Friend xiaoHong = new Friend("小红");
        Friend xiaoDong = new Friend("小东");
        xiaoMing.addObserver(xiaoHong);
        xiaoMing.addObserver(xiaoDong);
        xiaoMing.sendMessage("今天真开心");
        // 小红和小明闹别扭了，小红取消订阅小明的朋友圈
        xiaoMing.removeObserver(xiaoHong);
        xiaoMing.sendMessage("希望明天也像今天一样开心");

    }
}
