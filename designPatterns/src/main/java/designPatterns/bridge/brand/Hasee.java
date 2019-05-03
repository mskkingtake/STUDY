package designPatterns.bridge.brand;

public class Hasee implements Brand {
	
	@Override
	public void introduce() {
		System.out.print("我是神舟");
	}
}
