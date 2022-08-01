package inheritance;

import java.util.Scanner;

public class EmployeeApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
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
		while(true)
		{
			System.out.println("Enter employee to add");
			System.out.println("Enter 1 for Accountant, 2 for Supervisor, 3 for Machine Operator");
			System.out.println("4 for Design Engineer, 5 for Administrator");
			int option = sc.nextInt();
			int code, basicSalary, attendedDays;
			String name;
			switch(option)
			{
				case 1:
					System.out.println("Enter code: ");
					code = sc.nextInt();
					System.out.println("Enter name: ");
					name = sc.nextLine();
					System.out.println("Enter basic salary: ");
					basicSalary = sc.nextInt();
					System.out.println("Enter attended days: ");
					attendedDays = sc.nextInt();
			}
		}
	}

}
