package inheritance;

import java.util.ArrayList;

public class DesignEngineer extends Employee {

	public DesignEngineer(int code, String name, float basicSalary, int attendedDays) {
		super(code, name, basicSalary, attendedDays);
		// TODO Auto-generated constructor stub
	}
	
    static final int completedProjectIncentive = 10000;
	ArrayList<String> projectsCompletedDuringMonth = new ArrayList<String>();
	
	

	@Override
	void calculateSalary() {
		System.out.println("DesignEngineer calculateSalary is: "+(this.getBasicSalary()+completedProjectIncentive));
	}
	
	public float calculatedSalary() {
		return (this.getBasicSalary() + completedProjectIncentive);
	}
}
