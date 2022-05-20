package pracetice11;

public class HumanInfo {

	private String firstName;
	
	private String lastName;
	
	private int age;
	
	private String role;
	
	private int enScore;
	
	private int jaScore;
	
	private int mathScore;
	
	private int socialScore;
	
	private int scienceScore;
	
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
	
	public void setRole(String role) {
		this.role = role;
	}
	
	public String getRole() {
		return role;
	}
	
	public void setSubject(int enScore, int jaScore, int mathScore, int socialCore, int scienceScore) {
		this.enScore = enScore;
		this.jaScore = jaScore;
		this.mathScore = mathScore;
		this.socialScore = socialCore;
		this.scienceScore = scienceScore;
	}
	
	public int getEnScore() {
		return enScore;
	}
	
	public int getjaScore() {
		return jaScore;
	}
	
	public int getmathScore() {
		return mathScore;
	}
	
	public int getSocialScore() {
		return socialScore;
	}
	
	public int getScienceScore() {
		return scienceScore;
	}

}





