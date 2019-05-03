package designPatterns.adapter;

public class User {

	public void doRequest(Target target) {
		target.handleRequest();
	}
}
