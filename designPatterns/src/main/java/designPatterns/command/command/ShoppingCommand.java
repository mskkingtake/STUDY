package designPatterns.command.command;

import designPatterns.command.Command;

public class ShoppingCommand implements Command {

	public ShoppingCommand() {
		super();
	}

	@Override
	public String excute() {
		return "上街购物";
	}

}
