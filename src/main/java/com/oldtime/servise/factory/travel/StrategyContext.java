package com.oldtime.servise.factory.travel;

public class StrategyContext {
    private final ITravelStrategyInterface travelStrategy;

    public StrategyContext(ITravelStrategyInterface travelStrategy) {
        this.travelStrategy = travelStrategy;
    }

    public int calculateMinCost(){
        return travelStrategy.calculateMinCost();
    }
}
