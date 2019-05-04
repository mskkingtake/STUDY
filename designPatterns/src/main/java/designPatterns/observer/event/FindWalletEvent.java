package designPatterns.observer.event;

import designPatterns.observer.Event;

public class FindWalletEvent implements Event {

	@Override
	public String introduce() {
		return "找钱包";
	}
}
