import java.util.ArrayList;
import java.util.Scanner;

public class testClass {
	public static void main (String [] args ) {
		Scanner input = new Scanner(System.in);
		
		ArrayList <student> StudentList = new ArrayList <student>();
		//ArrayList <faculty> FacultyList = new ArrayList <faculty> ();
		int option;
		int stuId, facId;
		String couId, search;
		
		
		while (true) {
			System.out.println("Enter a number of the following Options.");
			System.out.println("1. Add");
			System.out.println("2. Delete");
			System.out.println("3. Search");
			System.out.println("4. Update");
			System.out.println("5. Exit");
			
			
			option = input.nextInt();
				if (option == 1) {								//1.Add
					System.out.println("1. Add a Student.");
					System.out.println("2. Add a Course.");
					System.out.println("3. Add a Faculty.");
					System.out.println("4. Add a Student in a Course.");
					option = input.nextInt();
						if(option == 1) {						//1.Add a Student
							System.out.println("Enter Student info(Id, Name, Cgpa).");
							student stu = new student ();
							stu.setStudentId(input.nextInt());
							stu.setStudentName(input.next());
							stu.setStudentCGPA(input.nextDouble());
							
							StudentList.add(stu);
						}
						
						else if(option == 2) {					//2.Add a Course
							System.out.println("Enter the Course Info (Id, Title, Credit)");
							course cou = new course();
							
							cou.setCourseId(input.next());
							cou.setCourseTitle(input.next());
							cou.setCourseCredit(input.nextDouble());
							
							course.CourseList.add(cou);
							//System.out.println(course.CourseList.get(0).getCourseId());
						}
						else if(option == 3) {					//3.Add a Faculty
							System.out.println("Enter the Faculty's info (Id, Name, Position)");
							faculty fac = new faculty();
							
							fac.setFacultyId(input.nextInt());
							fac.setFacultyName(input.next());
							fac.setFacultyPosition(input.next());
							
							fac.addFaculty(fac);
						}
						else if(option == 4) {					//4.Add Student in a Course.
							System.out.println("Enter the student ID and Course ID.");
							stuId = input.nextInt();
							couId = input.next();
							
							for(int i = 0; i < course.CourseList.size(); i++) {
								if(couId == course.CourseList.get(i).getCourseId()) {
									for(int j = 0; j < StudentList.size(); j++) {
										if(stuId == StudentList.get(i).getStudentId()) {
											course.Studentlist.add(StudentList.get(j));
										}
									}
								}
							}
						}//
						
						
				}
				else if (option == 2) {							//2.Delete
					System.out.println("1. Delete a Student.");
					System.out.println("2. Delete a Course.");
					System.out.println("3. Delete a Faculty.");
					option = input.nextInt();
					
						if(option == 1) {						//1.Delete a Student
							System.out.println("Enter the ID of the Student to be Deleted.");
							stuId = input.nextInt();
							
							for(int i = 0; i < StudentList.size(); i++) {
								if(stuId == StudentList.get(i).getStudentId()) {
									StudentList.remove(i);
									System.out.println("Done");
									break;
								}
								
							}
						}
						else if(option == 2) {					//2.Delete a Course
							System.out.println("Enter a Course ID to be Deleted.");
							couId = input.next();
							
							for(int i = 0; i < course.CourseList.size(); i++) {
								if(couId == course.CourseList.get(i).getCourseId()) {
									course.CourseList.remove(i);
									System.out.println("Done");
									break;
								}
							}
							
						}
						else if(option == 3) {					//3.Delete a Faculty
							System.out.println("Enter Faculty Id to be Deleted.");
							facId = input.nextInt();
							for(int i = 0; i < faculty.FacultyList.size(); i ++) {
								if(facId == faculty.FacultyList.get(i).getFacultyId()) {
									faculty.FacultyList.remove(i);
									System.out.println("Done");
									break;
								}
							}
							
						}
				}//
				else if(option == 3) {							//3.Search
					System.out.println("1. Search a Students.");
					System.out.println("2. Search a Courses.");
					System.out.println("3. Search a Faculties.");
					option = input.nextInt();
					
						if(option == 1) {						//1.Search a Student
							System.out.println("Enter the Student ID.");
							stuId = input.nextInt();
							for (int i = 0; i < StudentList.size(); i++) {
								if(stuId == StudentList.get(i).getStudentId()) {
									
									student.toString(StudentList.get(i));
									break;
								}
								else {
									System.out.println("Invalid Id");
								}
							}
						}
						else if(option == 2) {					//2.Search a Course
							System.out.println("Enter the Course ID");
							couId = input.next();
							for(int i = 0; i < course.CourseList.size(); i++) {
								search = course.CourseList.get(i).getCourseId();
								System.out.println(course.CourseList.get(0).getCourseId());
								//System.out.println(course.CourseList.get(1).getCourseId());
								 if(couId.equals(search) ) {	//IMPORTANT!!!! Use equals() for string Comparison
									 
									 course.toString(course.CourseList.get(i));
									 break;
								 }
								 else {
									 System.out.println("Invalid Id");
								 }
							}
						}
						else if(option == 3) {					//3.Search a Faculty
							System.out.println("Enter Faculty Id.");
							facId = input.nextInt();
							for(int i = 0; i < faculty.FacultyList.size(); i++) {
								if(facId == faculty.FacultyList.get(i).getFacultyId()) {
									
									faculty.toString(faculty.FacultyList.get(i));
									break;
								}
								else {
									System.out.println("Invalid Id");
								}
							}
						}
						else {
							System.out.println("Invalid Option.");
						}
				}
				else if(option == 4) {							//4.Update
					System.out.println("1. Update a Student.");
					System.out.println("2. Update a Course.");
					System.out.println("3. Update a Faculty.");
					
					option = input.nextInt();
						
						if(option == 1) {						//1.Update a Student
							System.out.println("Enter a Student ID to be Updated.");
							stuId = input.nextInt();
							
							
							for(int i = 0; i < StudentList.size(); i++) {
								if(stuId == StudentList.get(i).getStudentId()) {
									System.out.println("Enter Student info to be Updated. (Name, CGPA)");
									StudentList.get(i).setStudentName(input.next());  
									StudentList.get(i).setStudentCGPA(input.nextDouble());
									break;
								}
							}
						}
						else if(option == 2) {					//2.Update a Course
							System.out.println("Enter a Course ID to be Updated.");
							couId = input.next();
							
							for(int i = 0; i < course.CourseList.size(); i++) {
								if(couId == course.CourseList.get(i).getCourseId()) {
									System.out.println("Enter Course info to be Updated. (Title , Credits)");
									course.CourseList.get(i).setCourseTitle(input.next());
									course.CourseList.get(i).setCourseCredit(input.nextDouble());
									break;
								}
							}
						}
						else if(option == 3) {					//3.Update a Faculty
							System.out.println("Enter a Faculty ID to be Updated");
							facId = input.nextInt();
							
							for(int i = 0; i < faculty.FacultyList.size(); i++) {
								if(facId == faculty.FacultyList.get(i).getFacultyId()) {
									System.out.println("Enter Faculty info to be Updated. (Name, Position)");
									faculty.FacultyList.get(i).setFacultyName(input.next());
									faculty.FacultyList.get(i).setFacultyPosition(input.next());
									break;
								}
								else {
									System.out.println("Invalid ID");
								}
							}
						}
				}
				else if (option == 5) {							//5.Exit
					System.out.println("Finished.");
					break;
				}
				else if(option > 5) {
					System.out.println("Enter a Proper Option.");
				}
				
		}
		
		input.close();	
	}
}
