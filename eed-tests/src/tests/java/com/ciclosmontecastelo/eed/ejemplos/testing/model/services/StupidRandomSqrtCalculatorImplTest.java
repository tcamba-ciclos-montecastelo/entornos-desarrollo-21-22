package tests.java.com.ciclosmontecastelo.eed.ejemplos.testing.model.services;

import static org.mockito.Mockito.when;
import static org.assertj.core.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import main.java.com.ciclosmontecastelo.eed.ejemplos.testing.model.repositories.IRandomDatabaseRepository;
import main.java.com.ciclosmontecastelo.eed.ejemplos.testing.model.services.StupidRandomSqrtCalculatorImpl;
import main.java.com.ciclosmontecastelo.eed.ejemplos.testing.model.services.exceptions.NegativeSqrtException;


@ExtendWith(MockitoExtension.class)
class StupidRandomSqrtCalculatorImplTest {
	
	@Mock
	IRandomDatabaseRepository repoMock;
	
	@InjectMocks
	StupidRandomSqrtCalculatorImpl calculator;

	@Test
	public void calculateSqrtFromRandomDoublePlusANumberTest_WhenNegativeNumber_ShouldThrowNegativeSqrtException() {
		when(repoMock.findRandomDouble()).thenReturn(-1d);
		assertThatExceptionOfType(NegativeSqrtException.class).isThrownBy(() -> calculator.calculateSqrtFromRandomDoublePlusANumber(0d));
	}

}
