package designPatterns.factory.springFactorySimple.animal;

import designPatterns.factory.springFactorySimple.Animal;

public class Cat implements Animal {

	@Override
	public void cry() {
		System.out.println("猫叫...喵喵喵");
	}
}
