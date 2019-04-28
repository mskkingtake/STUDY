package designPatterns.proxy.staticProxy;

public class DbLodaer implements DBInterface {
	public void saveDate(Object obj) {
		System.out.println("SAVE DATE");
	}

}
