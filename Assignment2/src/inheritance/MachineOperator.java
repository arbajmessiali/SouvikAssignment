package inheritance;

public class MachineOperator extends Employee {

	public MachineOperator(int code, String name, float basicSalary, int attendedDays) {
		super(code, name, basicSalary, attendedDays);
	}
	
	float overTimeHours;
	String skill;
	static int perHourOverTimeRate = 100;
	float salary = 0;

	@Override
	void calculateSalary() {
    System.out.println("MachineOperator caluculatedSalary is:"+salary);
		
	}
	
	public float calculatedSalary(int overTime) {
		overTimeHours = overTime;
		salary = (this.getBasicSalary() + (overTimeHours*perHourOverTimeRate));
		return salary;
	}
	

}
