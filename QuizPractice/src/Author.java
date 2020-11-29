
public class Author {

	private String authorName;
	private double authorAge;
	private String dateOfBirth;
	private String surname;
	
	Author (){
		
		}

	public void setName(String name) {
		authorName = name;
	}
	public String getName() {
		return authorName;
	}
	
	public void setAge(double age) {
		authorAge = age;
	}
	public double getAge() {
		return authorAge;
	}
	
	public void setDOB(String dob) {
		dateOfBirth = dob;
	}
	public String getDOB() {
		return dateOfBirth;
	}
	
	public void setSurname(String sur) {
		surname = sur;
	}
	public String getSurname() {
		return surname;
	}
	
	public static void display(Author obj) {
		System.out.println("Author Name : " + obj.authorName);
		System.out.println("Author Age : " + obj.authorAge);
		System.out.println("Date of Birth : " + obj.dateOfBirth);
		System.out.println("Surname : " + obj.surname);
	}

}
		
	

