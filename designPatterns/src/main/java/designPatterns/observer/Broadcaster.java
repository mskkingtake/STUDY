package designPatterns.observer;

import java.util.ArrayList;
import java.util.List;

import designPatterns.observer.event.FindWalletEvent;

public class Broadcaster implements Runnable{
	List<Listener> listenerList = new ArrayList<Listener>();

	public List<Listener> getListenerList() {
		return listenerList;
	}

	public void setListenerList(List<Listener> listenerList) {
		this.listenerList = listenerList;
	}
	
	public void register(Listener listener) {
		listenerList.add(listener);
	}
	
	public void remove(Listener listener) {
		listenerList.remove(listener);
	}
	
	public void discoverWallet() {
		Event event = new FindWalletEvent();
		
		for (Listener listener : listenerList) {
			listener.doSomething(event);
		}
	}
	
	@Override
	public void run() {
		int i = 5000;
		
		while(i > 0) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			i = i - 1000;
			System.out.println("等待事件发,还有" + i/1000 + "秒");
		}
		
		this.discoverWallet();
	}
}
