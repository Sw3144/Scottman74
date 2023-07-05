import java.util.*;
import java.io.*;
public class TicketReader {

	public static void main(String[] args) throws Exception {
		
		File tickets = new File("./ticketNums.txt"); 
		Scanner read = new Scanner(tickets); 
				
		        //Create an array of booleans 

		        boolean[] neededNumbers = new boolean[101]; 

		  
		// while there is still something to read in the text file+
		        while (read.hasNextLine()) { 
		        	
		        	//splits the line into an array
		        	String[] currentLine = read.nextLine().split("\\s+"); 
		        	
		            for (int i = 0; i < currentLine.length; i++) { 
		            	int currentNumber = (int) Integer.parseInt(currentLine[i]);
		                neededNumbers[currentNumber] = true; 
		            } 

		        } 

		  

		        for (int i = 0; i < neededNumbers.length; i++) { 

		            if (neededNumbers[i] == false) { 

		                System.out.println("You do not have all the numbers."); 

		                System.exit(0); 

		            } 

		        } 

		        System.out.println("You have all the numbers.");
					
	}
	
	
}
