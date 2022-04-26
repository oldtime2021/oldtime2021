package com.oldtime.test;

import com.oldtime.servise.factory.music.IMusicRecommendInterface;
import com.oldtime.servise.factory.music.RecommendMusicFactory;

public class Test {

    private static final RecommendMusicFactory factory = new RecommendMusicFactory();

    public static void main(String[] args) {
        IMusicRecommendInterface building = factory.building("");
        building.recommend();
    }
}
