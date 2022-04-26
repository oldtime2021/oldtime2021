package com.oldtime.servise.factory.music;

import com.oldtime.servise.factory.music.impl.*;

public class RecommendMusicFactory {
    public IMusicRecommendInterface building(String style) {
        if ("metal".equals(style)) {
            return new MetalRecommendMusicImpl();
        } else if ("grunge".equals(style)) {
            return new GrungeRecommendMusicImpl();
        } else if ("country".equals(style)) {
            return new CountryRecommendMusicImpl();
        } else {
            return new DefaultRecommendMusicImpl();
        }
    }
}
