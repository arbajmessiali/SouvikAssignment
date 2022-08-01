package inheritance;

public class MachineOperator extends Employee {

	public MachineOperator(int code, String name, float basicSalary, int attendedDays) {
		super(code, name, basicSalary, attendedDays);
	}
	
	float overTimeHours = 2.00f;
	String skill;
	static int perHourOverTimeRate = 100;
	

	@Override
	void calculateSalary() {
    System.out.println("MachineOperator caluculatedSalary is:"+(this.getBasicSalary()+(overTimeHours*perHourOverTimeRate)));
		
	}
	
	

}
