package designPatterns.state;

public class Context {
	private State state;

	public State getState() {
		return state;
	}

	public void setState(State state) {
		System.out.println("修改状态");
		this.state = state;
		state.handle();
	}
}
