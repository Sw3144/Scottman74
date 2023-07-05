package playgames;

public class guessDate {

	package guessDate;

	import java.util.Scanner;

			public class guessDate {

			public static void main(String[] args) {

			int date = 0; // Date to be determined

			int answer;

			// Create a Scanner

			Scanner input = new Scanner(System.in);

			for (int i = 0; i < 5; i++) {

			System.out.println("Is your birthday in Set" + (i + 1) + "?");

			for (int j = 0; j < 4; j++) {

			for (int k = 0; k < 4; k++)

			System.out.print(guessDate.getValue(i, j, k)+ " ");

			System.out.println();

			}

			System.out.print("\nEnter 0 for No and 1 for Yes: ");

			answer = input.nextInt();

			int j = 0;
			int k = 0;
			if (answer == 1)

		 guessDate.getValue(i, j, k);

			}

			System.out.println("Your birthday is " + date);

			}

			private static String getValue(int i, int j, int k) {
				// TODO Auto-generated method stub
				return null;
			}

			

			 
		}


