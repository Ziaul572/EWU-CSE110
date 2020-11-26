import java.util.ArrayList;

public class faculty {

	private int facultyId;
	private String facultyName;
	private String facultyPosition;
	
	static ArrayList <faculty> FacultyList = new ArrayList <faculty> ();
	
	faculty (){
		
	}
	
	faculty(int id, String name, String pos){
		facultyId = id;
		facultyName = name;
		facultyPosition = pos;
	}
	
	public void setFacultyId(int id) {
		facultyId = id;
	}
	public int getFacultyId() {
		return facultyId;
	}
	public void setFacultyName(String name) {
		facultyName = name;
	}
	public String getFacultyName() {
		return facultyName;
	}
	public void setFacultyPosition(String pos) {
		facultyPosition = pos;
	}
	public String getFacultyPosition() {
		return facultyPosition;
	}
	
	public String toString() {
		System.out.println("Faculty ID : " + facultyId);
		System.out.println("Faculty Name : " + facultyName);
		System.out.println("Faculty Position : " + facultyPosition);
		return null;
	}
	public void addFaculty (faculty obj) {
		FacultyList.add(obj);
	}
	public void dropFaculty(faculty obj) {
		FacultyList.remove(obj);
	}
	
}
