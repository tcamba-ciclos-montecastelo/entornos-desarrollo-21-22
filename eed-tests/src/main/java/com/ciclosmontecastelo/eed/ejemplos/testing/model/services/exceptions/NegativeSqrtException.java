package main.java.com.ciclosmontecastelo.eed.ejemplos.testing.model.services.exceptions;

public class NegativeSqrtException extends RuntimeException {
	
	private static final long serialVersionUID = -3366200674429211728L;
	
	private static final String MESSAGE = "No se puede calcular la raiz cuadrada de un número negativo";
	
	public NegativeSqrtException() {
		super(MESSAGE);
	}
	
}
