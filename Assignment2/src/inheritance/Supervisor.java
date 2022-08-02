package inheritance;

public class Supervisor extends Employee {
     int dearnessAllowance = 700;
	 boolean targetAchieved;
	 static final int targetAchievedAmount = 2000;
	 float salary;

	public Supervisor(int code, String name, float basicSalary, int attendedDays) {
		super(code, name, basicSalary, attendedDays);
		
	}
	
	@Override
	void calculateSalary() {
		System.out.println("Supervisor calculateSalary is:" + salary);
	}
	
	public float calculatedSalary(boolean targetAchieved) {
		if(targetAchieved)
		{
			salary = this.getBasicSalary() + dearnessAllowance + targetAchievedAmount;
			return salary;
		}
		else
			salary = this.getBasicSalary() + dearnessAllowance;
		return salary;
	}

}
