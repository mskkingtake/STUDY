package designPatterns.strategy.simulateJdk.comprartor;

import designPatterns.strategy.simulateJdk.Comparator;
import designPatterns.strategy.simulateJdk.bean.Dog;

public class DogWeightComparator implements Comparator<Dog> {

	@Override
	public int compare(Dog dog1,Dog cdog2) {
		if(dog1.getWeight() > cdog2.getWeight()) {
			return 1;
		} else if (dog1.getWeight() < cdog2.getWeight()) {
			return -1;
		} else {
			return 0;
		}
	}
}
