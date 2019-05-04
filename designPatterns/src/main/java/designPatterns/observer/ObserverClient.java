package designPatterns.observer;

public class ObserverClient {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		String listenerStrs = CommonUtil.getProperties("listener");
		
		Broadcaster broadcaster = new Broadcaster();
		
		for(String listenerStr : listenerStrs.split(",")) {
			broadcaster.register((Listener)Class.forName(listenerStr).newInstance());;
		}
		
		new Thread(broadcaster).start();
	}

	
}
