package designPatterns.state.state;

import designPatterns.state.State;

public class BookState implements State {

	@Override
	public void handle() {
		System.out.println("房间预订");
	}
}
