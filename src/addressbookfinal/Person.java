package addressbookfinal;

public class Person
{
	
// Variable Declaration

	private String firstName;
	private String lastName;
	private String phone;
	private String email;

	@Override
	public String toString()
	{
		return "\n*********************** \n" +
			   "First Name: " + firstName + "\n" +
			   "Last Name: " + lastName + "\n" +
			   "Phone Number: " + phone + "\n" +
			   "Email: " + email + "\n" +
			   "*********************** \n";
	}
	
// Getters and Setters

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public String getPhone()
	{
		return phone;
	}

	public void setPhone(String phone)
	{
		this.phone = phone;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

// Constructors
	
	Person(String firstName, String lastName, String phone, String email)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
	}

}