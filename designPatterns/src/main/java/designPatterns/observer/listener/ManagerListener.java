package designPatterns.observer.listener;

import designPatterns.observer.Event;
import designPatterns.observer.Listener;

public class ManagerListener implements Listener {

	@Override
	public void doSomething(Event event) {
		System.out.println("经理处理事件-" + event.introduce());
	}
}
