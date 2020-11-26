

public class student {

	private int studentId;
	private String studentName;
	private double studentCGPA;
	
	public student() {
		
	}
	public student(int id, String name, double cgpa) {
		studentId = id;
		studentName = name;
		studentCGPA = cgpa;
	}
	
	public void setStudentId(int id) {
		studentId = id;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentName(String name) {
		studentName = name;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentCGPA(double cgpa) {
		studentCGPA = cgpa;
	}
	public double getStudentCGPA() {
		return studentCGPA;
	}
	
	public static String toString(student obj) {
		System.out.println("Student ID : " + obj.studentId);
		System.out.println("Student Name : " + obj.studentName);
		System.out.println("Student CGPA : " + obj.studentCGPA);
		return null;
	}
	
}
