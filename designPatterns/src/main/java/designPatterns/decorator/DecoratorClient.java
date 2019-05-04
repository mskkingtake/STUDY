package designPatterns.decorator;

import designPatterns.decorator.car.Car;
import designPatterns.decorator.car.FlayCar;
import designPatterns.decorator.car.WaterCar;

public class DecoratorClient {

	public static void main(String[] args) {
		Car car = new Car();
		car.move();
		
		System.out.println();
		System.out.println("---增加新功能---");
		FlayCar flayCar = new FlayCar(car);
		flayCar.move();
		
		System.out.println();
		System.out.println("---增加新功能---");
		WaterCar waterCar = new WaterCar(car);
		waterCar.move();
		
		System.out.println();
		System.out.println("---增加新功能---");
		waterCar = new WaterCar(flayCar );
		waterCar.move();
	}
}
