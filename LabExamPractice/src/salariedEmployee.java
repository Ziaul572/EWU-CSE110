import java.text.ParseException;

public class salariedEmployee extends Employee{
	private double weeklySalary;
	
	salariedEmployee(){
		
	}
	salariedEmployee(String fname, String lname, String Snum, double weeksal) {
		super(fname, lname, Snum);
		weeklySalary = weeksal;
	}
	public void setWeekSalary(double weeksal) {
		weeklySalary = weeksal;
	}
	public double getWeeklySalary() {
		return weeklySalary;
	}
	
	public String toString() {
		System.out.println("First Name : " + getFname());
		System.out.println("Last Name : " + getLname());
		System.out.println("Security Number : " + getSecurityNum());
		try {
			System.out.println(super.getBirthdate());
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		//print Bday;
		return null;
	}
	public double earning() {
		weeklySalary = weeklySalary * 4;
		return weeklySalary;
	}
	@Override
	double earning(Employee obj) {
		return 0;
	}
	@Override
	protected void setHour(double nextDouble) {
	}
	@Override
	protected void setWage(double nextDouble) {
	}
	@Override
	String searchEmployee(String snum) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	String toString(Employee obj) {
		// TODO Auto-generated method stub
		return null;
	}

}
