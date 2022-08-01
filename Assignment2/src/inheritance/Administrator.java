package inheritance;

public class Administrator extends Employee {

	public Administrator(int code, String name, float basicSalary, int attendedDays) {
		super(code, name, basicSalary, attendedDays);
	}
	
	int numberOfLocalTravels = 100;
	static final int hra = 4000;
	
	@Override
	void calculateSalary() {
		System.out.println("Administrator calculateSalary is: "+(this.basicSalary+numberOfLocalTravels+hra));
	}

}
