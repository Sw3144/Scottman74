//*****************************************
//Scotty Wilkins
//March 22, 2023
//COCS 1172
//Temperature Calculation Project
//*****************************************
import java.util.Scanner;
public class Temperature {
	

	
	public static void main(String[] args) {
		//please enter degrees in fahrenheit
				
						
				Scanner input = new Scanner(System.in);
				System.out.println("Enter the degrees in Celsius: ");
				double celsius = input.nextDouble();
				double fahrenheit = celsiusToFahrenheit(celsius);
				System.out.println( celsius + " Celsius equals to " + fahrenheit + " Fahrenheit");
				
				System.out.println("Celsius\tFahrenheit");
				for (int i = 0; i < 10; i++ ) {

					// Display result

					System.out.println((40-i)+"\t"+celsiusToFahrenheit ((40-i))+"\t\t");

					}
		
	}
	
	public static double celsiusToFahrenheit(double celsius) {
		// TODO Auto-generated method stub
		
		

		// Compute the temperature in celsius
		double fahrenheit = ((9.0/5)* celsius) + 32;
		
		
		return Math.round(fahrenheit); 
		
		// Display result
		
			
	}

	

}
