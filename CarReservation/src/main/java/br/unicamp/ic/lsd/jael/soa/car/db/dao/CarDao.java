package br.unicamp.ic.lsd.jael.soa.car.db.dao;

import java.util.List;

import br.unicamp.ic.lsd.jael.soa.car.db.entities.Car;

public interface CarDao {
	public List<Car> getAvailableCar(String country, String from, String to);
}
