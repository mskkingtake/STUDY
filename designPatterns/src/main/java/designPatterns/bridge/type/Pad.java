package designPatterns.bridge.type;

import designPatterns.bridge.brand.Brand;

public class Pad extends Type {
	protected Brand brand;

	public Pad(Brand brand) {
		super(brand);
		this.brand = brand;
	}
	
	public void introduce() {
		this.brand.introduce();
		System.out.println("平板");
	}
}
