package designPatterns.bridge.type;

import designPatterns.bridge.brand.Brand;

public class Computer extends Type {
	public Computer(Brand brand) {
		super(brand);
	}
	
	public void introduce() {
		this.brand.introduce();
		System.out.println("电脑");
	}
}
