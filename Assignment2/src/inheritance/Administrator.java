package inheritance;

public class Administrator extends Employee {

	public Administrator(int code, String name, float basicSalary, int attendedDays) {
		super(code, name, basicSalary, attendedDays);
	}
	
	float salary;
	int numberOfLocalTravels;
	static final int hra = 4000;
	
	@Override
	void calculateSalary() {
		System.out.println("Administrator calculateSalary is: "+salary);
	}

	public float calculatedSalary(int noOfTravels) {
		numberOfLocalTravels = noOfTravels;
		salary = this.getBasicSalary() + (numberOfLocalTravels*100) +hra;
		return salary;
	}
}
