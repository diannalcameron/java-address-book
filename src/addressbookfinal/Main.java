package addressbookfinal;

import java.util.Scanner;

public class Main
{
	public static void mainMenu()
	{
		Scanner scanner = new Scanner(System.in);
		Book book = new Book();
		
		System.out.println
		(
			  "Address Book - Main Menu! \n"
			+ "What would you like to do? \n"
		);
		System.out.println
		(
			  "1 for 'Add an Entry' \n"
			+ "2 for 'Remove an Entry' \n"
			+ "3 for 'Search for Specific Entry' \n"
			+ "4 for 'Print Address Book' \n"
			+ "5 for 'Delete Address Book' \n"
			+ "6 for 'Quit the Program'"
		);
		String choice = scanner.next();
		int intChoice = Integer.parseInt(choice);
		// try catch
		
	// Choice is 1 - Add an Entry
		if (intChoice == 1)
		{
			Book.addEntry();
			mainMenu();
		}
		
	// Choice is 2 - Remove an Entry
		else if (intChoice == 2)
		{
			Book.removeEntry();
			mainMenu();
		}
		
	// Choice is 3 - Search for Specific Entry
		else if (intChoice == 3)
		{
			Book.searchBook();
			mainMenu();
		}
		
	// Choice is 4 - Print Address Book
		else if (intChoice == 4)
		{
			System.out.println("Here's your Address Book contents: \n");
			Book.printBook();
			System.out.println("\n");
			mainMenu();
		}
		
	// Choice is 5 - Delete Address Book
		else if (intChoice == 5)
		{
			Book.clearBook();
			System.out.println("Address Book has been cleared! \n");
			mainMenu();
		}
		
	// Choice is 6 - Quit the Program
		else if (intChoice == 6)
		{
			System.out.println("Quitting the program, goodbye!");
			System.exit(0);
		}
		
	// Choice is not a number 1 through 6
		else if (!(intChoice > 0 && intChoice < 7))
		{
			System.out.println("Choice not available. Please enter a number 1 through 6. \n");
			mainMenu();
		}
	}

	public static void main (String[] args)
	{
		mainMenu();
	}
}