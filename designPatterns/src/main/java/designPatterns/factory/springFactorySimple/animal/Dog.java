package designPatterns.factory.springFactorySimple.animal;

import designPatterns.factory.springFactorySimple.Animal;

public class Dog implements Animal {

	@Override
	public void cry() {
		System.out.println("狗叫...汪汪汪");
	}
}
