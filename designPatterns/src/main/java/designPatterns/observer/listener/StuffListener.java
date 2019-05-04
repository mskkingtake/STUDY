package designPatterns.observer.listener;

import designPatterns.observer.Event;
import designPatterns.observer.Listener;

public class StuffListener implements Listener {

	@Override
	public void doSomething(Event event) {
		System.out.println("员工处理事件-" + event.introduce());
	}
}
