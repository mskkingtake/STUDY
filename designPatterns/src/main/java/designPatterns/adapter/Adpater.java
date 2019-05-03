package designPatterns.adapter;

public class Adpater implements Target {
	Adpatee adpatee;
	
	public Adpater(Adpatee adpatee) {
		super();
		this.adpatee = adpatee;
	}

	@Override
	public void handleRequest() {
		adpatee.request();
	}
}
