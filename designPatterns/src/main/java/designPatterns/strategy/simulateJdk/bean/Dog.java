package designPatterns.strategy.simulateJdk.bean;

import designPatterns.strategy.simulateJdk.Comparable;
import designPatterns.strategy.simulateJdk.Comparator;
import designPatterns.strategy.simulateJdk.comprartor.DogWeightComparator;

public class Dog implements Comparable<Dog> {

	private Comparator<Dog> comparator = new DogWeightComparator();
	private int length;

	/**
	 * 
	 * @param length
	 */
	public Dog(int length) {
		super();
		this.length = length;
	}

	public int getWeight() {
		return length;
	}

	public void setWeight(int length) {
		this.length = length;
	}

	@Override
	public int compareTo(Dog inDog) {
		return comparator.compare(this, inDog);
	}
	
	@Override
	public String toString() {
		return length + "   ";
	}
}
