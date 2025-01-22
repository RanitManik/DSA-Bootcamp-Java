package A14__oops.src;

class Vehicle {
	String regNo;
	String companyName;
	float price;
	
	void getData(String regNo, String companyName, float price) {
		this.regNo = regNo;
		this.companyName = companyName;
		this.price = price;
	}
	
	void displayData() {
		System.out.println("Registry Number: " + regNo);
		System.out.println("Company Name: " + companyName);
		System.out.println("Price: " + price);
	}
}

class LightMotorVehicle extends Vehicle {
	float milage;
	
	void getData(String regNo, String companyName, float price, float milage) {
		super.getData(regNo, companyName, price);
		this.milage = milage;
	}
	
	@Override
	void displayData() {
		super.displayData();
		System.out.println("Milage: " + milage);
	}
}

class HeavyMotorVehicle extends Vehicle {
	float cot; // capacity in tons
	
	void getData(String regNo, String companyName, float price, float cot) {
		super.getData(regNo, companyName, price);
		this.cot = cot;
	}
	
	@Override
	void displayData() {
		super.displayData();
		System.out.println("Capacity in Tons: " + cot);
	}
}

class Main3 {
	public static void main(String[] args) {
		Vehicle vehicle1 = new Vehicle();
		LightMotorVehicle vehicle2 = new LightMotorVehicle();
		HeavyMotorVehicle vehicle3 = new HeavyMotorVehicle();
		
		// set the data
		vehicle1.getData("d7awg9dawydv3t", "Volkswagen", 500000); // Vehicle
		vehicle2.getData("daw8yddwa9dywa", "BMW", 5000000, 45.3f); // Light Vehicle
		vehicle3.getData("wd8ahg79wgfawu", "Rolls Royece", 50000000, 0.35f); // Heavy Vehicle
		
		// print the data
		vehicle1.displayData();
		vehicle2.displayData();
		vehicle3.displayData();
	}
}
