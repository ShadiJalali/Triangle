package com.tradeshift.jalali.challenge.triangle;

public enum TriangleType{
	
	EQUILATERAL("EQUILATERAL"),
	ISOSCELES("ISOSCELES"),
	SCALENE("SCALENE");
	
	private String type;
	
	private TriangleType(String type){
		this.type = type;
	}
	
	public String getType(){
		return this.type;
	}
	
}
