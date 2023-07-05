package raggedarray;

import java.util.Scanner; 
public class raggedarray {

	 

	

	   	//main method 

	 public static void main(String args[]) { 

	 //variable declaration 

	 int rows; 

	 //Scanner class object 

	 Scanner reader = new Scanner(System.in); 

	 //reading number of rows 

	 System.out.println(" specify numbers of rows:"); 

	 rows=reader.nextInt(); 

	 //creating ragged array 

	 int [][] arr = new int [rows][]; 

	 //Allocating columns in each row 

	 for (int i=0;i<rows; i++) { 

	 arr[i]=new int[i+1]; } 

	 //assigning values to elements 

	 for (int i=0; i < arr.length; i++) { 

	          for ( int j = 0; j<arr[i].length; j++) { 

	 //calculating sum of row and column and assigning to element 

	 arr[i][j]=i+1+j+1; 

	 } 

	 } 

	 System.out.println("Ragged Array Created: ");
	 //Printing ragged array 

	 for (int i = 0; i<arr.length; i++) { 

	  	for (int j = 0; j<arr[i].length; j++) { 

	 //printing elements 

	 System.out.printf("%-5d", arr [i][j]);  } 

	 System.out.println(); 

	 } 

	 } 

	 } 

	  