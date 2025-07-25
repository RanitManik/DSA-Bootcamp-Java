package A17__oops.src;

class Employee {
	String employee_id;
	String name;
	String date_of_birth;
	String designation;
	float basic_salary;

	Employee(
		String employee_id,
		String name,
		String date_of_birth,
		String designation,
		float basic_salary
	) {
		this.employee_id = employee_id;
		this.name = name;
		this.date_of_birth = date_of_birth;
		this.designation = designation;
		this.basic_salary = basic_salary;
	}

	void printData() {
		System.out.println("Printing The Employee Information => ");
		System.out.println("Employee ID: " + this.employee_id);
		System.out.println("Name: " + this.name);
		System.out.println("Date of Birth: " + this.date_of_birth);
		System.out.println("Designation: " + this.designation);
		System.out.println("Basic Salary: " + this.basic_salary);
		System.out.println("Net Salary: " + (this.basic_salary * 210 / 100));
	}
}

class Main2 {
	public static void main(String[] args) {
		Employee employee1 = new Employee(
			"d89aywdahd80yawd",
			"Ranit KUmar Manik",
			"05/05/2005",
			"Developer",
			15000
		);

		employee1.printData();
	}
}
