package com.oldtime.servise.factory.travel.impl;

import com.oldtime.servise.factory.travel.ITravelStrategyInterface;

public class PublicTransportStrategyImpl implements ITravelStrategyInterface {
    @Override
    public int calculateMinCost() {
        return 5;
    }
}
