package com.oldtime.servise.factory.travel;

import com.oldtime.servise.factory.travel.impl.*;

public class TravelStrategyFactory {
    public ITravelStrategyInterface building(String type) {
        if ("selfDriving".equals(type)) {
            return new SelfDrivingStrategyImpl();
        } else if ("bicycle".equals(type)) {
            return new BicycleStrategyImpl();
        } else {
            return new PublicTransportStrategyImpl();
        }
    }
}
