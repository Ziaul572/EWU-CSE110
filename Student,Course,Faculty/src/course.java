import java.util.ArrayList;

public class course {

	private String courseId;
	private String courseTitle;
	private double courseCredit;
	private int numberofStudents;
	
	ArrayList <student> Studentlist = new ArrayList <student>();
	static ArrayList <course> CourseList = new ArrayList <course> ();
	
	
//	student Obj = new student();
	faculty Faculty = new faculty();
	
	public course (){
		
	}
	public course (String id, String title, double cred){
		courseId = id;
		courseTitle = title;
		courseCredit = cred;
	}
	
	public void setCourseId(String id) {
		courseId = id;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseTitle(String title) {
		courseTitle = title;
	}
	public String getCourseTitle() {
		return courseTitle;
	}
	public void setCourseCredit(double cred) {
		courseCredit = cred;
	}
	public double getCourseCredit() {
		return courseCredit;
	}
	public void setNumOfStudents(int num) {
		numberofStudents = num;
	}
	public int getNumOfStudents() {
		return numberofStudents;
	}
	
	public String toString() {
		System.out.println("Course ID : " + courseId);
		System.out.println("Course Title : " + courseTitle);
		System.out.println("Course Credit : " + courseCredit);
		return null;
	}
	
	
	public void addStudent(student obj) {
		Studentlist.add(obj);
	}
	public void dropStudent(student obj) {
		Studentlist.remove(obj);
	}
	
	public void addCourse(course obj) {
		CourseList.add(obj);
	}
	public void dropCourse(course obj) {
		CourseList.remove(obj);
	}
}
