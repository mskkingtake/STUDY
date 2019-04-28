package designPatterns.strategy.simulateJdk.comprartor;

import designPatterns.strategy.simulateJdk.Comparator;
import designPatterns.strategy.simulateJdk.bean.Cat;

public class CatHeightComparator implements Comparator<Cat> {

	@Override
	public int compare(Cat cat1,Cat cat2) {
		if(cat1.getHeight() > cat2.getHeight()) {
			return 1;
		} else if (cat1.getHeight() < cat2.getHeight()) {
			return -1;
		} else {
			return 0;
		}
	}
}
