package week2.day1;


public class EmployeeDetails {
	public void printEmployeeName(String empName, int empId){
		System.out.println("employee Name : "+empName );
		System.out.println("employee ID : "+empId);
	}
	public void printGetEmployeeAddress(String empAddress) {
		System.out.println("employee Adreess : " +empAddress);
		
	}
	public void printEmployeeSalary(double empSalary) {
		System.out.println("employee Salary : " +empSalary);
	}
	public void printEmployeeMobileNumber(Long mobNum) {
		System.out.println("employee Number : "+mobNum);
	}
	
	
	public static void main(String[] args) {
		EmployeeDetails employee=new EmployeeDetails();
		employee.printEmployeeName("Ajay", 1);
        employee.printGetEmployeeAddress("Chennai");
        employee.printEmployeeSalary(20000.00);
        employee.printEmployeeMobileNumber(9898797876L);
	
		
	
	}


}
