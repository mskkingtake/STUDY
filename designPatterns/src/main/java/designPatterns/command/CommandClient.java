package designPatterns.command;

public class CommandClient {

	public static void main(String[] args) {
		Leader leader = new Leader();
		leader.call();
	}
}
