package com.oldtime.servise.impl;

import com.oldtime.servise.ITravelStrategyService;
import com.oldtime.servise.factory.travel.ITravelStrategyInterface;
import com.oldtime.servise.factory.travel.StrategyContext;
import com.oldtime.servise.factory.travel.TravelStrategyFactory;
import com.oldtime.servise.factory.travel.impl.BicycleStrategyImpl;
import com.oldtime.servise.factory.travel.impl.PublicTransportStrategyImpl;
import com.oldtime.servise.factory.travel.impl.SelfDrivingStrategyImpl;

public class TravelStrategyServiceImpl implements ITravelStrategyService {
    private final TravelStrategyFactory travelStrategyFactory = new TravelStrategyFactory();

    @Override
    public int calculateMinCost(String type) {
        //工厂模式实现
//        ITravelStrategyInterface travelStrategy = travelStrategyFactory.building(type);
//        return travelStrategy.calculateMinCost();



        //策略模式实现
        ITravelStrategyInterface travelStrategy;

        if ("selfDriving".equals(type)) {
            travelStrategy = new SelfDrivingStrategyImpl();
        } else if ("bicycle".equals(type)) {
            travelStrategy = new BicycleStrategyImpl();
        } else {
            travelStrategy = new PublicTransportStrategyImpl();
        }

        StrategyContext strategyContext = new StrategyContext(travelStrategy);
        return strategyContext.calculateMinCost();
    }
}
