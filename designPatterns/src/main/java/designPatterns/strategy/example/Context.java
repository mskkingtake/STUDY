package designPatterns.strategy.example;

public class Context {
	private GoodsStrategy goodsStrategy;

	public Context(GoodsStrategy goodsStrategy) {
		super();
		this.goodsStrategy = goodsStrategy;
	}

	public GoodsStrategy getGoodsStrategy() {
		return goodsStrategy;
	}

	public void setGoodsStrategy(GoodsStrategy goodsStrategy) {
		this.goodsStrategy = goodsStrategy;
	}
	
	public void printPrice(Double price) {
		System.out.println("折扣价格为:" + goodsStrategy.getPrice(price));
	}
}
