package main.chcek;

import main.chcek.situp.SitUpImpl;

public class Main {
    public static void main(String[] args){
        // 원하는 초 * 1000
        SitUpImpl s = new SitUpImpl.Builder(20000).builder();
        s.doRecording();

        System.out.println("윗몸일으키기 횟수" + s.getCount());
    }
}
