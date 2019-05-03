package designPatterns.command.command;

import designPatterns.command.Command;

public class CatCommand implements Command {

	@Override
	public String excute() {
		return "喂猫";
	}

}
