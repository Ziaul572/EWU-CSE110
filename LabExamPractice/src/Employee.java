import java.text.ParseException;
import java.text.SimpleDateFormat;  
import java.util.Date;  

abstract class Employee {
		private String firstName;
		private String lastName;
		private String securityNum;
		private static double earning;
		private String birthdate;
		
		Employee(){
			
		}
		Employee(String fname, String lname, String Snum){
			firstName = fname;
			lastName = lname;
			securityNum = Snum;
		}
		public void setFname(String fname) {
			firstName = fname;
		}
		public String getFname() {
			return firstName;
		}
		public void setLname(String lname) {
			lastName = lname;
		}
		public String getLname() {
			return lastName;
		}
		public void setSecurityNum(String sNum) {
			securityNum = sNum;
		}
		public String getSecurityNum() {
			return securityNum;
		}
		public void setEarning(double earn) {
			earning = earn;
		}
		public double getEarning() {
			return earning;
		}
		public Date getBirthdate() throws ParseException {
			Date bdate = new SimpleDateFormat("dd/MM/yyyy").parse(birthdate);
			return bdate;
		}
		public void setBirthdate(String birthdate) {
			this.birthdate = birthdate;
		}
		
		abstract String toString(Employee obj);
		abstract double earning(Employee obj);
		protected abstract void setWeekSalary(double nextDouble);
		protected abstract void setHour(double nextDouble);
		protected abstract void setWage(double nextDouble);
		
		abstract String searchEmployee(String snum);
		
}
