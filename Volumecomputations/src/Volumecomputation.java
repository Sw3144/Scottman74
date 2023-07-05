//COCS1173 

//Scotty Wilkins 

//February 8, 2023 

import java.util.Scanner;

public class Volumecomputation {  

	public static void main(String[] args) {  



		// Declare a constant  

		// Create a Scanner objectScanner 
		Scanner input = new Scanner(System.in);  

		// Prompt the user to enter radius of a cylinder 

		System.out.print("Enter a number in cylinder radius: "); 
		double radius = input.nextDouble();  


		//Prompt the user to enter length of a cylinder 

		System.out.print("Enter a number in cylinder length: "); 

		double length = input.nextDouble();  

		// Compute radius
		
		double area = radius * radius* Math.PI;  

		// Compute volume 
		double volume =area *length; 

		// Display result
		System.out.println("Equals " + area+ " area");  

		// Display result60
		System.out.println("Equals " + volume + " volume"); 

		input.close();  

	} 

}  
 