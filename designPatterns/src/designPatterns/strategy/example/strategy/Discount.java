package designPatterns.strategy.example.strategy;

import designPatterns.strategy.example.GoodsStrategy;

public class Discount implements GoodsStrategy {

	@Override
	public double getPrice(double realPrice) {
		if(realPrice >= 100) {
			return realPrice - 1;
		} else if(realPrice >= 1000) {
			return realPrice - 10;
		} else {
			return realPrice;
		}
	}

}
