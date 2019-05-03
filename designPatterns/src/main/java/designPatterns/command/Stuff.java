package designPatterns.command;

import java.util.List;

public class Stuff {
	private String name;
	List<Command> commandList;
	
	public Stuff(String name, List<Command> commandList) {
		super();
		this.name = name;
		this.commandList = commandList;
	}
	
	/**
	 * 
	 */
	public void excute() {
		for(Command command : commandList) {
			System.out.println(name + ":" + command.excute());
		}
	}
}
