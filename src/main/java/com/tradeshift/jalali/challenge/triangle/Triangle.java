package com.tradeshift.jalali.challenge.triangle;

public class Triangle implements Shape{
	
	private double firstSide;
	private double secondSide;
	private double thirdSide;

	public Triangle(double firstSide, double secondSide, double thirdSide) throws InvalidShapeException {
		this.firstSide = firstSide;
		this.secondSide = secondSide;
		this.thirdSide = thirdSide;
		if (!isValid()){
			throw new InvalidShapeException("Invalid side lenghts for triangle.");
		}		
	}

	public double getFirstSide() {
		return firstSide;
	}

	public void setFirstSide(double firstSide) {
		this.firstSide = firstSide;
	}

	public double getSecondSide() {
		return secondSide;
	}

	public void setSecondSide(double secondSide) {
		this.secondSide = secondSide;
	}

	public double getThirdSide() {
		return thirdSide;
	}

	public void setThirdSide(double thirdSide) {
		this.thirdSide = thirdSide;
	}
	
	public boolean isValid(){
		boolean result = false;
		if ( firstSide > 0 && secondSide > 0 && thirdSide > 0){
			if ( firstSide + secondSide > thirdSide &&
					firstSide + thirdSide > secondSide &&
					secondSide + thirdSide > firstSide){
				result = true;
			}
		}
		return result;
	}
	
	public String getType(){
		String type = null;
		if(isEquilateral()){
			type = TriangleType.EQUILATERAL.getType();
		}else if (isIsosceles()){
			type = TriangleType.ISOSCELES.getType();
		}else if (isScalene()){
			type = TriangleType.SCALENE.getType();
		}
		return type;
	}
	
	public boolean isEquilateral(){
		boolean result = false;
		if( firstSide == secondSide && secondSide == thirdSide ){
			result = true;
		}
		return result;
	}
	
	public boolean isIsosceles(){
		boolean result = false;
		if ( (firstSide == secondSide && firstSide != thirdSide) ||
				(firstSide == thirdSide && firstSide != secondSide ) ||
				(secondSide == thirdSide && secondSide != firstSide )){
			result = true;
		}
		return result;
	}
	
	public boolean isScalene(){
		boolean result = false;
		if ( firstSide != secondSide && firstSide != thirdSide && secondSide != thirdSide){
			result = true;
		}
		return result;
		
	}
}
