package designPatterns.factory.abstractFactory.carFactory;

import designPatterns.factory.abstractFactory.CarFactory;
import designPatterns.factory.abstractFactory.Engine;
import designPatterns.factory.abstractFactory.Seat;
import designPatterns.factory.abstractFactory.Tyre;
import designPatterns.factory.abstractFactory.engine.EngineLevel2;
import designPatterns.factory.abstractFactory.seat.SeatLevel2;
import designPatterns.factory.abstractFactory.tyre.TyreLevel2;

public class CarFactoryLevel2 implements CarFactory {

	@Override
	public Engine createEngine() {
		return new EngineLevel2();
	}

	@Override
	public Seat createSeat() {
		return new SeatLevel2();
	}

	@Override
	public Tyre createTyre() {
		return new TyreLevel2();
	}
}
