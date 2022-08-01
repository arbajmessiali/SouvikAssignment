package inheritance;

public abstract class Employee {
	int code;
	String name = " ";
	float basicSalary;
	int attendedDays;
	static final int perDayWorkinhHours = 0;
	static int workinDaysInMonth;
	static int month;
	
	
	public Employee(int code, String name, float basicSalary, int attendedDays) {
		super();
		this.code = code;
		this.name = name;
		this.basicSalary = basicSalary;
		this.attendedDays = attendedDays;
	}


	 abstract void calculateSalary();
	
	
}