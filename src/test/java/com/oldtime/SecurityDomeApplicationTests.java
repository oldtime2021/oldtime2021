package com.oldtime;

import com.oldtime.servise.ITravelStrategyService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class SecurityDomeApplicationTests {
    @Resource
    ITravelStrategyService travelStrategyService;

    @Test
    void contextLoads() {
        travelStrategyService.calculateMinCost("selfDriving");
    }

}
