package com.oldtime.servise.factory.music.impl;

import com.oldtime.servise.factory.music.IMusicRecommendInterface;

import java.util.ArrayList;
import java.util.List;

public class GrungeRecommendMusicImpl implements IMusicRecommendInterface {
    @Override
    public List<String> recommend(){
        List<String> recommendMusicList = new ArrayList<>();
        recommendMusicList.add("grunge");
        return recommendMusicList;
    }
}
