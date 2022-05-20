package pracetice11;

public class HumanInfo {

	private String firstName;
	
	private String lastName;
	
	private int age;
	
	private String role;
	
	
	public void setName(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getName() {
		return firstName + " " + lastName;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}

}





