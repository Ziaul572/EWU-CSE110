import java.util.ArrayList;
import java.util.Scanner;

public class testMain {
	public static void main (String [] args) {
		int option;
		Scanner input = new Scanner(System.in);
		
		ArrayList<Employee> employeeList = new ArrayList<Employee> ();
		while(true) {
			System.out.println("1. Press 1 for Salaried Employee.");
			System.out.println("2. Press 2 for Hourly Employee.");
			System.out.println("3. Press 3 for Next.");
			
			option = input.nextInt();
			if(option == 1) {
				Employee salEmp = new salariedEmployee();
				
				System.out.println("Employee's First Name.");
				salEmp.setFname(input.next());
				
				System.out.println("Employee's Last Name.");
				salEmp.setLname(input.next());
				
				System.out.println("Employee's Security Number");
				salEmp.setSecurityNum(input.next());
				
				System.out.println("Enter Employee's Birthday.(dd/MM/yyyy");
				salEmp.setBirthdate(input.next());
				
				System.out.println("Employee's Weekly Salary.");
				salEmp.setWeekSalary(input.nextDouble());
			
			employeeList.add(salEmp);
			}
			else if (option == 2) {
				Employee hourEmp = new hourlyEmployee();
				
				System.out.println("Employee's First Name.");
				hourEmp.setFname(input.next());
				
				System.out.println("Employee's Last Name.");
				hourEmp.setLname(input.next());
				
				System.out.println("Employee's Security Number");
				hourEmp.setSecurityNum(input.next());
				
				System.out.println("Enter Employee's Birthday.(dd/MM/yyyy");
				hourEmp.setBirthdate(input.next());
				
				System.out.println("Employee's Work Hour.");
				hourEmp.setHour(input.nextDouble());
				
				System.out.println("Employee's Work Wage.");
				hourEmp.setWage(input.nextDouble());
				
			employeeList.add(hourEmp);
			}
			else if(option == 3) {
				break;
			//	System.out.println("")
			}
			else {
				System.out.println("Invalid Option.");
			}
			
		}
		//input.close();
			String security;
			boolean search = false;
			System.out.println("1. Press 1 to Search an Employee.");
			System.out.println("2. Press 2 to Compare an Employee.");
			System.out.println("3. Exit.");
		while(true) {
			option = input.nextInt();
			if (option == 1) {
				System.out.println("Enter Employee's Security Number.");
				security = input.next();
				for(int i = 0; i < employeeList.size(); i++) {
					if(security.equals(employeeList.get(i).getSecurityNum())) {
						employeeList.get(i).toString();
						search = true;
						//System.out.println("Good");
					}
				}
				if(search == false) {
					System.out.println("Security Number not matched.");
				}
			}
			else if(option == 2) {
				break; //compare
			}
			else if(option == 3) {
				System.out.println("Thank you.");
				break;
			}
		}
		input.close();
	}
}
