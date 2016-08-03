package com.tradeshift.jalali.challenge.triangle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TriangleClient 
{
    public static void main( String[] args )
    {
    	try {
    		Scanner scanner = new Scanner(System.in);
    		System.out.print("Enter First Side Lenght : ");
    		double firstSide = scanner.nextDouble();
    		System.out.print("Enter Second Side Lenght : ");
    		double secondSide = scanner.nextDouble();
    		System.out.print("Enter Third Side Lenght : ");
    		double thirdSide = scanner.nextDouble();

    		Triangle triangle = new Triangle(firstSide, secondSide, thirdSide);
    		if (triangle.isEquilateral()){
    			System.out.println("The triangle is equilateral.");
    		}else if (triangle.isIsosceles()){
    			System.out.println("The triangle is isosceles.");
    		}else if ( triangle.isScalene()){
    			System.out.println("The triangle is scalene.");
    		}
    	}catch (InputMismatchException e){
    		System.out.println("Unexcepted input is entered, excepted type is a number.");
    	} catch (InvalidShapeException e) {
    		System.out.println(e.getMessage());
    	}

    }
}
