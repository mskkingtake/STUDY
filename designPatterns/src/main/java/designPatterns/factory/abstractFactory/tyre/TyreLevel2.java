package designPatterns.factory.abstractFactory.tyre;

import designPatterns.factory.abstractFactory.Tyre;

public class TyreLevel2 implements Tyre {

	@Override
	public void motion() {
		System.out.println("运动颠簸");
	}
}
