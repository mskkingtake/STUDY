package designPatterns.bridge.brand;

public class Lenovo implements Brand {

	@Override
	public void introduce() {
		System.out.print("我是联想");
	}

}
