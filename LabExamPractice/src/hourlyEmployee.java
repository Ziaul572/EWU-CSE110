import java.text.ParseException;

public class hourlyEmployee extends Employee{
	private double wage, hour, earning;
	
	hourlyEmployee(){
		
	}
	hourlyEmployee(String fname, String lname, String Snum, double wage, double hour) {
		super(fname, lname, Snum);
		// TODO Auto-generated constructor stub
		this.wage = wage;
		this.hour = hour;
	}
	
	public void setWage(double wage) {
		this.wage = wage;
	}
	public double getWage() {
		return wage;
	}
	public void setHour(double hour) {
		this.hour = hour;
	}
	public double getHour() {
		return hour;
	}	
	public double earning() {
		earning = wage * hour;
		return earning;
	}
	public String toString() {
		System.out.println("First Name : " + getFname());
		System.out.println("Last Name : " + getLname());
		System.out.println("Security Number : " + getSecurityNum());
		//System.out.println("Earning : " + earning);
		try {
			System.out.println(super.getBirthdate());
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		return null;
	}

	@Override
	double earning(Employee obj) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	protected void setWeekSalary(double nextDouble) {
		// TODO Auto-generated method stub
		
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
