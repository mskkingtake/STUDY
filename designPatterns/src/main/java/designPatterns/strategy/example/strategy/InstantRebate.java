package designPatterns.strategy.example.strategy;

import designPatterns.strategy.example.GoodsStrategy;

public class InstantRebate implements GoodsStrategy {

	@Override
	public double getPrice(double realPrice) {
		if(realPrice >= 100) {
			return realPrice * 0.9;
		} else if(realPrice >= 1000) {
			return realPrice * 0.8;
		} else {
			return realPrice;
		}
	}

}
