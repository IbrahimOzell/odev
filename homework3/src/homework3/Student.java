package homework3;

public class Student extends User{
	private String firstName;
	private String lastName;
	
	
	public Student(int id,String firstName, String lastName, String email, String userName, String course) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
