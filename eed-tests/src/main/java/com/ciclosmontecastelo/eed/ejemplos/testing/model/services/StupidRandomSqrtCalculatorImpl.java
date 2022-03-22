package main.java.com.ciclosmontecastelo.eed.ejemplos.testing.model.services;

import main.java.com.ciclosmontecastelo.eed.ejemplos.testing.model.repositories.IRandomDatabaseRepository;
import main.java.com.ciclosmontecastelo.eed.ejemplos.testing.model.services.exceptions.NegativeSqrtException;

public class StupidRandomSqrtCalculatorImpl implements IStupidRandomSqrtCalculator {
	
	private final IRandomDatabaseRepository randomRepo;
	
	public 	StupidRandomSqrtCalculatorImpl(IRandomDatabaseRepository randomRepo) {
		this.randomRepo = randomRepo;
	}

	@Override
	public double calculateSqrtFromRandomDoublePlusANumber(double number) {
		
		Double randomDouble = randomRepo.findRandomDouble();
		if (randomDouble < 0) {
			throw new NegativeSqrtException();
		} else {
			return Math.sqrt(randomDouble) + number;
		}
		
	}

}
