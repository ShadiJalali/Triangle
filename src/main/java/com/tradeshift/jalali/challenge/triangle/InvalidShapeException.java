package com.tradeshift.jalali.challenge.triangle;

public class InvalidShapeException extends Exception {

	private static final long serialVersionUID = -3178123549691233537L;

	
	public InvalidShapeException() {
		super("Invalid Shape parameters");
	}


	public InvalidShapeException(String message) {
		super(message);
	}
	
	

}
