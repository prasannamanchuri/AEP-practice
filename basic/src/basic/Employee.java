package basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Employee {
	String firstname;
	String lastname;
	Double salary;

	public Employee(String firstname, String lastname,Double salary) {
		this.firstname=firstname;
		this.lastname=lastname;
		this.salary=salary;
	}
	

	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public Double getSalary() {
		return salary;
	}


	public void setSalary(Double salary) {
		this.salary = salary;
	}


	public static void main(String[] args) {
		ArrayList<Employee> employee=new ArrayList<Employee>(); 
	      employee.add(new Employee("prasanna","manchuri",21800.0));
	      employee.add(new Employee("hani","siddula",520000.0));
	      employee.add(new Employee("keerthi","siddula",5300000.0));
	      employee.add(new Employee("marasani","marasani",5289000.0));
	      employee.forEach(Employee -> System.out.println("firstname: " + Employee.getFirstname()));
	     //employee.forEach(Employee -> System.out.println("firstname: " + Employee.getFirstname() +" ,"+"lastname: " + Employee.getLastname()+" , "+"salary: " + Employee.getSalary()));
	      Collections.sort(employee, Comparator.comparingDouble(Employee::getSalary));
          employee.forEach(Employee -> System.out.println("firstname: " + Employee.getFirstname() +" ,"+"lastname: " + Employee.getLastname()+" , "+"salary: " + Employee.getSalary()));;
    
	   }
	
	}




