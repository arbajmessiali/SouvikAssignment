package inheritance;

import java.util.ArrayList;

public class DesignEngineer extends Employee {

	public DesignEngineer(int code, String name, float basicSalary, int attendedDays) {
		super(code, name, basicSalary, attendedDays);
		// TODO Auto-generated constructor stub
	}
	
	float salary;
	
    static final int completedProjectIncentive = 10000;
	ArrayList<String> projectsCompletedDuringMonth = new ArrayList<String>();
	
	

	@Override
	void calculateSalary() {
		System.out.println("DesignEngineer calculateSalary is: "+ salary);
	}
	
	public float calculatedSalary(ArrayList<String> projects) {
		projectsCompletedDuringMonth = projects;
		salary = (this.getBasicSalary()+(projectsCompletedDuringMonth.size()*completedProjectIncentive));
		return salary;
	}
}
