package designPatterns.state;

import designPatterns.state.state.BookState;
import designPatterns.state.state.CheckInState;
import designPatterns.state.state.FreeState;

public class StateClient {

	public static void main(String[] args) {
		Context context = new Context();
		context.setState(new FreeState());
		context.setState(new BookState());
		context.setState(new CheckInState());
	}
}
