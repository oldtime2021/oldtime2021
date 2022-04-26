package com.oldtime.servise;

import java.util.List;

public interface IRecommendMusicService {
    List<String> recommend(String style);
}
