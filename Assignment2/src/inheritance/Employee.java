package inheritance;

public abstract class Employee {
	private int code;
	private String name;
	private float basicSalary;
	private int attendedDays;
	static final int perDayWorkinhHours = 0;
	static int workinDaysInMonth;
	static int month;
	
	public int getCode() {
		return code;
	}


	public void setCode(int code) {
		this.code = code;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getBasicSalary() {
		return basicSalary;
	}


	public void setBasicSalary(float basicSalary) {
		this.basicSalary = basicSalary;
	}


	public int getAttendedDays() {
		return attendedDays;
	}


	public void setAttendedDays(int attendedDays) {
		this.attendedDays = attendedDays;
	}
	
	public Employee(int code, String name, float basicSalary, int attendedDays) {
		super();
		this.code = code;
		this.name = name;
		this.basicSalary = basicSalary;
		this.attendedDays = attendedDays;
	}

	 abstract void calculateSalary();
	
}