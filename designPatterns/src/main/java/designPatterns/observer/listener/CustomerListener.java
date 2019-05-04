package designPatterns.observer.listener;

import designPatterns.observer.Event;
import designPatterns.observer.Listener;

public class CustomerListener implements Listener {

	@Override
	public void doSomething(Event event) {
		System.out.println("顾客处理事件-" + event.introduce());
	}
}
