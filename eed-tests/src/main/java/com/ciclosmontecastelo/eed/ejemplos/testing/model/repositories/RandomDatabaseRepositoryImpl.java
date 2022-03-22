package main.java.com.ciclosmontecastelo.eed.ejemplos.testing.model.repositories;

import java.util.Random;

public class RandomDatabaseRepositoryImpl implements IRandomDatabaseRepository {

	@Override
	public double findRandomDouble() {
		return new Random().nextDouble()*1000d - 1000d;
	}

}
