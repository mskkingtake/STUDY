package designPatterns.strategy.simulateJdk.bean;

import designPatterns.strategy.simulateJdk.Comparable;
import designPatterns.strategy.simulateJdk.Comparator;
import designPatterns.strategy.simulateJdk.comprartor.CatComparator;

public class Cat implements Comparable<Cat> {

	private Comparator<Cat> comparator = CatComparator.getInstance().getComparator();
	private int weight;
	private int height;

	/**
	 * 
	 * @param comparator
	 * @param weight
	 * @param height
	 */
	public Cat(int weight, int height) {
		super();
		this.weight = weight;
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public int compareTo(Cat inCat) {
		return comparator.compare(this, inCat);
	}
	
	@Override
	public String toString() {
		return weight + "|" + height + "   ";
	}
}
