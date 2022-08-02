package inheritance;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeApplication {
	
	static Scanner sc;
	
	private static List<Employee> allEmp = new ArrayList<Employee>();
	private static float[] calcSalary = new float[100];
	static int count = 0;
	
	static boolean call = true;
	private static int code;
	private static int basicSalary;
	private static int attendedDays;
	private static String name;
	
	public static int chooseOption(){
		sc = new Scanner(System.in);
		System.out.println("Enter your choice of action: ");
		System.out.println("1. Add Employee");
		System.out.println("2. Display all employees");
		System.out.println("3. Display individual salary details");
		int option = sc.nextInt();
		return option;
	}
	
	public static void enterDetails(){
		sc = new Scanner(System.in);
		System.out.println("Enter code: ");
		code = sc.nextInt();
		System.out.println("Enter name: ");
		name = sc.next();
		System.out.println("Enter basic salary: ");
		basicSalary = sc.nextInt();
		System.out.println("Enter attended days: ");
		attendedDays = sc.nextInt();
	}
	
	public static void addEmployee(){
		sc = new Scanner(System.in);
		boolean flag = true;
		while(flag)
		{
			System.out.println("Enter employee to add");
			System.out.println("Enter 1 for Accountant, 2 for Supervisor, 3 for Machine Operator");
			System.out.println("4 for Design Engineer, 5 for Administrator");
			int option = sc.nextInt();
			switch(option)
			{
				case 1:
					enterDetails();
					Accountant acc = new Accountant(code, name, basicSalary, attendedDays);
					allEmp.add(acc);
					acc.calculateSalary();
					calcSalary[count] = acc.calculatedSalary();
					count++;
					break;
				case 2:
					enterDetails();
					boolean targetCheck = true;
					System.out.println("Is the target achieved?");
					String target = sc.next();
					if(target.equalsIgnoreCase("no")||target.equalsIgnoreCase("n"))
						targetCheck = false;
					Supervisor sup = new Supervisor(code, name, basicSalary, attendedDays);
			        allEmp.add(sup);
			        calcSalary[count] = sup.calculatedSalary(targetCheck);
					sup.calculateSalary();
					count++;
			        break;
				case 3:
					enterDetails();
			        MachineOperator mo = new MachineOperator(code, name, basicSalary, attendedDays);
			        mo.calculateSalary();
			        allEmp.add(mo);
			        calcSalary[count] = mo.calculatedSalary();
					count++;
			        break;
				case 4:
					enterDetails();
			        DesignEngineer de = new DesignEngineer(code, name, basicSalary, attendedDays);
			        de.calculateSalary();
			        allEmp.add(de);
			        calcSalary[count] = de.calculatedSalary();
					count++;
			        break;
				case 5:
					enterDetails();
			        Administrator admin = new Administrator(code, name, basicSalary, attendedDays);
			        admin.calculateSalary();
			        allEmp.add(admin);
			        calcSalary[count] = admin.calculatedSalary();
					count++;
					break;
			    default:
			    	System.out.println("Wrong Input! Enter again.");
			    
			}
			System.out.println("Do you want to add more?");
			String c = sc.next();
			if(c.equalsIgnoreCase("no")||c.equalsIgnoreCase("n"))
				flag = false;
		}
	}
	
	
	
	public static void main(String[] args){
		sc = new Scanner(System.in);
		while(call)
		{
			select();
		}
		System.out.println("Thank you for using our service.");
		sc.close();
		/*
		Accountant acc = new Accountant(1, "Vasu", 5000.00f, 31);
        acc.calculateSalary();
        Supervisor sup = new Supervisor(2, "Ramu", 7000.00f, 29);
        sup.calculateSalary();
        MachineOperator mo = new MachineOperator(3,"sushma", 20000.00f, 25);
        mo.calculateSalary();
        DesignEngineer de = new DesignEngineer(4, "keerthi", 40000.00f, 30);
        de.calculateSalary();
        Administrator admin = new Administrator(5, "suresh", 50000.00f, 31);
        admin.calculateSalary();	*/
	}

	private static void select() {
		sc = new Scanner(System.in);
		boolean flag = true;
		while(flag)
		{
			int option = chooseOption();
			switch(option) {
			case 1:
				addEmployee();
				break;
			case 2:
				System.out.println("Code" + "\t\t\t" + "Name" + "\t\t\t"
						+ "Basic Salary" + "\t\t" + "Attended Days");
				for (int i = 0; i < allEmp.size(); i++) {
					System.out.println(allEmp.get(i).getCode() + "\t\t\t" + allEmp.get(i).getName() + "\t\t\t"
							+ allEmp.get(i).getBasicSalary() + "\t\t\t" + allEmp.get(i).getAttendedDays());
				}
				break;
			case 3:
				System.out.println("Code" + "\t\t\t" + "Name" + "\t\t\t"
						+ "Basic Salary" + "\t\t" + "Calculated Salary");
				for (int i = 0; i < allEmp.size(); i++) {
					System.out.println(allEmp.get(i).getCode() + "\t\t\t" + allEmp.get(i).getName() + "\t\t\t"
							+ allEmp.get(i).getBasicSalary() + "\t\t\t" + calcSalary[i]);
				}
				break;
			default:
				System.out.println("Wrong Input");	
			}
			System.out.println("Do you want to continue?");
			String a = sc.next();
			if(a.equalsIgnoreCase("no")||a.equalsIgnoreCase("n"))
			{
				flag = false;
				call = false;
			}
		}
	}
}
