import java.util.ArrayList;
import java.util.Scanner;

public class main {
	public static void Main (String [] args ) {
		Scanner input = new Scanner(System.in);
		
		ArrayList <student> StudentList = new ArrayList <student>();
		//ArrayList <faculty> FacultyList = new ArrayList <faculty> ();
		//int option;
		int StuId, FacId;
		String CouId;
		
		student Stu = new student ();
		course cou = new course();
		faculty fac = new faculty();
		
		while (true) {
			System.out.println("Enter a number of the following Options.");
			System.out.println("1. Add");
			System.out.println("2. Delete");
			System.out.println("3. Exit");
			//option = input.nextInt();
				if (input.nextInt() == 1) {
					System.out.println("1. Add a Student.");
					System.out.println("2. Add a Course.");
					System.out.println("3. Add a Faculty.");
					System.out.println("4. Add a Student in a Course.");
					
						if(input.nextInt() == 1) {
							System.out.println("Enter Student info(Id, Name, Cgpa).");
							Stu.setStudentId(input.nextInt());
							Stu.setStudentName(input.next());
							Stu.setStudentCGPA(input.nextDouble());
							
							StudentList.add(Stu);
						}
						
						else if(input.nextInt() == 2) {
							System.out.println("Enter the Course Info (Id, Title, Credit)");
							cou.setCourseId(input.next());
							cou.setCourseTitle(input.next());
							cou.setCourseCredit(input.nextDouble());
							
							cou.addCourse(cou);
						}
						else if(input.nextInt() == 3) {
							System.out.println("Enter the Faculty's info (Id, Name, Position)");
							fac.setFacultyId(input.nextInt());
							fac.setFacultyName(input.next());
							fac.setFacultyPosition(input.next());
							
							fac.addFaculty(fac);
						}
						else if(input.nextInt() == 4) {
							System.out.println("Enter the student ID and Course ID.");
							StuId = input.nextInt();
							CouId = input.next();
							
							for(int i = 0; i < course.CourseList.size(); i++) {
								if(CouId == course.CourseList.get(i).getCourseId()) {
									for(int j = 0; j < StudentList.size(); j++) {
										if(StuId == StudentList.get(i).getStudentId()) {
											course.CourseList.get(i).addStudent(StudentList.get(j));
										}
									}
								}
							}
						}//
						
						
				}
				else if (input.nextInt() == 2) {
					System.out.println("1. Delete a Student.");
					System.out.println("2. Delete a Course.");
					System.out.println("3. Delete a Faculty.");
					
						if(input.nextInt() == 1) {
							System.out.println("Enter the ID of the Student to be Deleted.");
							StuId = input.nextInt();
							
							for(int i = 0; i < StudentList.size(); i++) {
								if(StuId == StudentList.get(i).getStudentId()) {
									StudentList.remove(i);
									break;
								}
								
							}
						}
						else if(input.nextInt() == 2) {
							System.out.println("Enter a Course ID to be Deleted.");
							CouId = input.next();
							
							for(int i = 0; i < course.CourseList.size(); i++) {
								if(CouId == course.CourseList.get(i).getCourseId()) {
									course.CourseList.remove(i);
									break;
								}
							}
							
						}
						else if(input.nextInt() == 3) {
							System.out.println("Enter Faculty Id to be Deleted.");
							FacId = input.nextInt();
							for(int i = 0; i < faculty.FacultyList.size(); i ++) {
								if(FacId == faculty.FacultyList.get(i).getFacultyId()) {
									faculty.FacultyList.remove(i);
								}
							}
							
						}
				}
				else if (input.nextInt() == 3) {
					System.out.println("Finished.");
					break;
				}
				else {
					System.out.println("Enter a Proper Option.");
				}
				input.close();
			
			
		}
		
		
		//student Student = new student();
		//faculty Faculty = new faculty ();
		
		
		
	
		
	}
}
