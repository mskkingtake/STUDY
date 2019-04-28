package designPatterns.strategy.simulateJdk;

import designPatterns.strategy.simulateJdk.bean.Cat;
import designPatterns.strategy.simulateJdk.bean.Dog;
import designPatterns.strategy.simulateJdk.comprartor.CatComparator;
import designPatterns.strategy.simulateJdk.comprartor.CatWeightComparator;

public class ClientTest {

	public static void main(String[] args) {
		
		CatComparator.getInstance().setComparator(new CatWeightComparator());
		
		// Cat比较
		Cat cat1 = new Cat(1,1);
		Cat cat2 = new Cat(89,89);
		Cat cat3 = new Cat(23,23);
		Cat cat4 = new Cat(55,55);
		Cat cat5 = new Cat(9,9);
		Cat[] cats = new Cat[] {cat1, cat2, cat3, cat4, cat5};
		Sorter.sort(cats);
		Sorter.print(cats);
		
		
		// Dog比较
		Dog dog1 = new Dog(11);
		Dog dog2 = new Dog(8989);
		Dog dog3 = new Dog(2323);
		Dog dog4 = new Dog(5555);
		Dog dog5 = new Dog(99);
		Dog[] dogs = new Dog[] {dog1, dog2, dog3, dog4, dog5};
		Sorter.sort(dogs);
		Sorter.print(dogs);
	}
}
