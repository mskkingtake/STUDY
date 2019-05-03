package designPatterns.command;

import java.util.ArrayList;
import java.util.List;

import designPatterns.command.command.CatCommand;
import designPatterns.command.command.ShoppingCommand;

public class Leader {
	
	List<Command> commandList = new ArrayList<Command>();
	
	public void call() {
		commandList.add(new ShoppingCommand());
		commandList.add(new CatCommand());
		
		Stuff stuff = new Stuff("张三", commandList);
		stuff.excute();
	}
}
