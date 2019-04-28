package designPatterns.strategy.example;

import designPatterns.strategy.example.bean.Goods;
import designPatterns.strategy.example.strategy.InstantRebate;

public class ClientTest {

	public static void main(String[] args) {
		Goods goods = new Goods();
		goods.setPrice(990);
		
		
		GoodsStrategy goodsStrategy = new InstantRebate();
		Context Context = new Context(goodsStrategy);
		Context.printPrice(goods.getPrice());
	}
}
