package CorejavaRevision;

import java.util.Scanner;

public class EmployeeInheritance {
	double basic;
	double totalsalary;

	void calculate() {
		totalsalary = basic;
		System.out.println("manager salary is:" + totalsalary);
	}

	public static void main(String[] args) {

		EmployeeInheritance e;
		e = new Manager();
		e.calculate();
		e = new Labour();
		e.calculate();
		((Labour) e).add();

	}

}

class Labour extends EmployeeInheritance {
	void calculate() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter wages of labour");
		double basic = sc.nextFloat();
		System.out.println("enter over time");
		double overtime = sc.nextFloat();
		totalsalary = basic + overtime;
		System.out.println("labour salary is:" + totalsalary);
	}
	void add()
	{
		System.out.println("this is add");
	}

}

class Manager extends EmployeeInheritance {
	void calculate() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter basic of employee");
		double basic = sc.nextFloat();
		System.out.println("enter Incentives");
		double intensive = sc.nextFloat();
		totalsalary = basic + intensive;
		System.out.println("manager salary is:" + totalsalary);
	}

}
