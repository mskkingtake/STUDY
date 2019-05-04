package designPatterns.state.state;

import designPatterns.state.State;

public class CheckInState implements State {

	@Override
	public void handle() {
		System.out.println("房间入住");
	}
}
