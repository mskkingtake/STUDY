package designPatterns.bridge.brand;

public class Dell implements Brand {
	
	@Override
	public void introduce() {
		System.out.print("我是戴尔");
	}
}
