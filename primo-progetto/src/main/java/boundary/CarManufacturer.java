package boundary;

import java.util.UUID;

import entity.Car;
import entity.Specification;

public class CarManufacturer {
	
	public Car manufactureCar(Specification specification) {
		Car car = createCar(specification);
		return car;
		
	}
	
	private Car createCar(Specification specification) {
		Car car = new Car();
		car.setIdentifier(UUID.randomUUID().toString());
		car.setColor(specification.getColor());
		car.setEngineType(specification.getEnginetype());
		return car;
	}

}
