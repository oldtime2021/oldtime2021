package com.oldtime.test;

import com.oldtime.servise.factory.music.IMusicRecommendInterface;
import com.oldtime.servise.factory.music.RecommendMusicFactory;

import java.util.List;

public class Test {
    //新加注释

    private static final RecommendMusicFactory factory = new RecommendMusicFactory();

    public static void main(String[] args) {
        IMusicRecommendInterface building = factory.building("");
        List<String> recommend = building.recommend();

        recommend.add("test");
        
        //test
    }
}
