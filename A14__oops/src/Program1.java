package A14__oops.src;

class Student1 {
	String name;
	String city;
	int age;

	void setData(String name, String city, int age) {
		this.name = name;
		this.city = city;
		this.age = age;
	}

	void printData() {
		System.out.println("Name: " + this.name);
		System.out.println("City: " + this.city);
		System.out.println("Age: " + this.age);
	}
}


class Main1 {
	public static void main(String[] args) {
		Student1 s1 = new Student1();
		s1.setData("Ranit Kumar Manik", "Mecheda", 19);
		s1.printData();
	}
}
