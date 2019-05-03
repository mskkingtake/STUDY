package designPatterns.bridge.type;

import designPatterns.bridge.brand.Brand;

public class Type {
	protected Brand brand;

	public Type(Brand brand) {
		super();
		this.brand = brand;
	}
	
	public void introduce() {
		this.brand.introduce();
	}
}
