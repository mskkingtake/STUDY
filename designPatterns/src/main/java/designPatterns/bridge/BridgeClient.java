package designPatterns.bridge;

import designPatterns.bridge.brand.Hasee;
import designPatterns.bridge.brand.Lenovo;
import designPatterns.bridge.type.Computer;
import designPatterns.bridge.type.Pad;
import designPatterns.bridge.type.Type;

public class BridgeClient {

	public static void main(String[] args) {	
		Type computer = new Computer(new Lenovo());
		computer.introduce();
		
		Type pad = new Pad(new Hasee());
		pad.introduce();
	}
}
