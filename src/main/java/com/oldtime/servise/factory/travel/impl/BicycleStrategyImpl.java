package com.oldtime.servise.factory.travel.impl;

import com.oldtime.servise.factory.travel.ITravelStrategyInterface;

public class BicycleStrategyImpl implements ITravelStrategyInterface {
    @Override
    public int calculateMinCost() {
        return 15;
    }
}
