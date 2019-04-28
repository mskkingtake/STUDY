package designPatterns.proxy.dynamicProxy;

public class DbLodaer implements DBInterface {
	public void saveDate(Object[] args) {
		System.out.println("SAVE DATE");
	}

}
