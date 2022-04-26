package com.oldtime.servise.impl;

import com.oldtime.servise.IRecommendMusicService;
import com.oldtime.servise.factory.music.IMusicRecommendInterface;
import com.oldtime.servise.factory.music.RecommendMusicFactory;
import lombok.extern.java.Log;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log
public class RecommendMusicServiceImpl implements IRecommendMusicService {
    private final RecommendMusicFactory recommendMusicFactory = new RecommendMusicFactory();

    @Override
    public List<String> recommend(String style) {
        IMusicRecommendInterface musicRecommend = recommendMusicFactory.building(style);
        return musicRecommend.recommend();
    }

    public static void main(String[] args) {
        System.out.println(RecommendMusicServiceImpl.class.getName());
        System.out.println(RecommendMusicServiceImpl.class);
    }
}
