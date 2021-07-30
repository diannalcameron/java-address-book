package addressbookfinal;

import java.util.ArrayList;
import java.util.Scanner;

public class Book extends Main
{
	static ArrayList<Person> entries = new ArrayList<>();
	
// Add an entry
	
	public static void addEntry()
	{
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Great! Lets add a new entry. \n");
		System.out.println("First Name: ");
			String firstName = scanner.next();
		System.out.println("Last Name: ");
			String lastName = scanner.next();
		System.out.println("Phone Number, i.e. 8881234567: ");
			String phone = scanner.next();
		System.out.println("Email Address, i.e. email@mail.com: ");
			String email = scanner.next();

		Person person = new Person(firstName, lastName, phone, email);
			entries.add(person);
		System.out.println("\nYour recent entry: \n" + person);
	}
	
// Remove entry from Address Book method
	
	public static void removeEntry()
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Okay, lets remove an entry. \n");
		System.out.println("Enter an email address for the person you'd like to remove: ");
		String remove = scanner.next();
		
		if(!entries.isEmpty())
		{
			for(Person person : entries)
			{
				if (person.getEmail().equalsIgnoreCase(remove))
				{
					entries.remove(person);
					System.out.println("Entry has been deleted! \n");
					mainMenu();
				} else {
					System.out.println("Email not found. Returning to Main Menu. \n");
					break;
				}
			}
		}
	}
	
// Search the Address Book method
	
	public static void searchBook()
	{
		Scanner scanner = new Scanner(System.in);
		
		if(entries.isEmpty())
		{
			System.out.println("The Address Book is empty! Add an entry first. \n");
		}
		
		else {
			System.out.println("Choose what you'd like to search by. \n");
			System.out.println
			(
				  "1 to search by First Name \n"
				+ "2 to search by Last Name \n"
				+ "3 to search by Phone Number \n"
				+ "4 to search by Email Address"
			);
			int find = scanner.nextInt();
				
			if (!(find > 0 && find < 5))
			{
				System.out.println("Choice not available. Please enter a number 1 through 4. \n");
				mainMenu();
			}
		
			else if (!entries.isEmpty())
			{
				if (find == 1) // Searching by First Name
				{
					System.out.println("Enter persons First Name: ");
					String descriptor = scanner.next();
					for(Person person: entries) {
						if (person.getFirstName().contains(descriptor))
						{
							System.out.println(person);
						} else if (!(person.getFirstName().contains(descriptor))){
							System.out.println("First name not found. Try your search again. \n");
							break;
						}
					}
				} else if (find == 2) {
					System.out.println("Enter persons Last Name: ");
					String descriptor = scanner.next();
					for(Person person: entries) {
						if (person.getLastName().contains(descriptor))
						{
							System.out.println(person);
						} else {
							System.out.println("Last name not found. Try your search again. \n");
							break;
						}
					}
				} else if (find == 3) {
					System.out.println("Enter a phone number, i.e. 8881234567: ");
					String descriptor = scanner.next();
					for(Person person: entries) {
						if (person.getPhone().contains(descriptor))
						{
							System.out.println(person);
						} else {
							System.out.println("Phone number not found. Try your search again. \n");
							break;
						}
					}
				} else if (find == 4) {
					System.out.println("Enter an email address, i.e. email@mail.com");
					String descriptor = scanner.next();
					for(Person person: entries) {
						if (person.getEmail().contains(descriptor))
						{
							System.out.println(person);
						} else {
							System.out.println("Email address not found. Try your search again. \n");
							break;
						}
					}
				}
			}
		}
	}

// Print Address Book method
	
	public static void printBook()
	{
		if (entries.isEmpty())
		{
			System.out.println("The Address Book is empty! Add an entry first. \n");
		} else {
			System.out.println(entries);
		}
	}
	
// Clear Address Book method
	
	public static void clearBook()
	{
		entries.clear();
	}
}