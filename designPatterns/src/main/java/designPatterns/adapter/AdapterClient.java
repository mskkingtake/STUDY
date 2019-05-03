package designPatterns.adapter;

public class AdapterClient {

	public static void main(String[] args) {
		User user = new User();
		Adpatee adpatee = new Adpatee();
		Target target = new Adpater(adpatee);
		
		user.doRequest(target);
	}
}
