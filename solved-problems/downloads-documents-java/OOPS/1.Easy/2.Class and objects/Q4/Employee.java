import java.time.LocalDate;

class Employee{
	
	private String name;
	private double salary;
	private LocalDate hireDate;
	
	public Employee(String name, double salary, LocalDate hireDate){
		this.name = name;
		this.salary = salary;
		this.hireDate = hireDate;
	}
	
	@Override
	public String toString(){
		return "Name : " + name + "\nSalary : " + salary + "\nHire Date : " + hireDate;
	}
}
