package com.oldtime.servise.factory.travel.impl;

import com.oldtime.servise.factory.travel.ITravelStrategyInterface;

public class SelfDrivingStrategyImpl implements ITravelStrategyInterface {
    @Override
    public int calculateMinCost() {
        return 30;
    }
}
