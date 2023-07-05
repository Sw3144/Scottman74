//Scotty Wilkins
//February 21, 2023
//COCS 1172
//Switch Case Project

import java.util.*;
public class CalenderMonthSwitchCaseProgram {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.println("Enter your BMI: ");
	    double BMI = input.nextDouble();

	// first implementation
	    if(BMI < 18.5)
		System.out.println("underweight");
	    else if(18.5<=BMI && BMI<25.0)
	   	System.out.println("Normal or Healthy weight");
	    else if(25.0<=BMI && BMI<30)
		System.out.println("Overweight");
	    else 
		System.out.println("Obese");
	    
	    input.close();
	  



	}

	}