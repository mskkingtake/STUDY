package designPatterns.factory.abstractFactory.carFactory;

import designPatterns.factory.abstractFactory.CarFactory;
import designPatterns.factory.abstractFactory.Engine;
import designPatterns.factory.abstractFactory.Seat;
import designPatterns.factory.abstractFactory.Tyre;
import designPatterns.factory.abstractFactory.engine.EngineLevel1;
import designPatterns.factory.abstractFactory.seat.SeatLevel1;
import designPatterns.factory.abstractFactory.tyre.TyreLevel1;

public class CarFactoryLevel1 implements CarFactory {

	@Override
	public Engine createEngine() {
		return new EngineLevel1();
	}

	@Override
	public Seat createSeat() {
		return new SeatLevel1();
	}

	@Override
	public Tyre createTyre() {
		return new TyreLevel1();
	}
}
