package inheritance;

public class Supervisor extends Employee {
     int dearnessAllowance = 700;
	 boolean targetAchieved;
	 static final int targetAchievedAmount = 2000;

	public Supervisor(int code, String name, float basicSalary, int attendedDays) {
		super(code, name, basicSalary, attendedDays);
		
	}

	@Override
	void calculateSalary() {
		System.out.println("Supervisor calculateSalary is:" + (this.getBasicSalary() + dearnessAllowance + targetAchievedAmount ));
		
	}
	
	public float calculatedSalary() {
		return (this.getBasicSalary() + dearnessAllowance + targetAchievedAmount);
	}

}
