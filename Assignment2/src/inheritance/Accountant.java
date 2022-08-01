package inheritance;

public class Accountant extends Employee {
public Accountant(int code, String name, float basicSalary, int attendedDays) {
		super(code, name, basicSalary, attendedDays);
		// TODO Auto-generated constructor stub
	}

static final int travellingAllowance = 500;
@Override
public void calculateSalary() {
	System.out.println("Accountant calculateSalary is:" + (this.basicSalary + travellingAllowance));
	
}
}
