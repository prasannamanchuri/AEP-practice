package basic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Salary {
	int s;
	public static void main(String[] args) {
		File f=new File("");
		
		//FileInputStream br=new FileInputStream(f);
		ArrayList<Emp1map> employee = new ArrayList<Emp1map>();
		employee.add(new Emp1map("prasanna", "manchuri", 1800));
		employee.add(new Emp1map("John", "thomas", 54767));
		employee.add(new Emp1map("Jack", "jill", 97750));
		employee.add(new Emp1map("bhanu", "hi", 32750));
		employee.add(new Emp1map("keer", "hello", 7750));
		employee.add(new Emp1map("hani", "ok", 15550));
		employee.add(new Emp1map("ravi", "hm", 60750));
		employee.add(new Emp1map("lalitha", "welcome", 100000));
		Map<String, ArrayList<Emp1map>> salaryMap = new HashMap<>();
		ArrayList<Emp1map> employee1 = new ArrayList<Emp1map>();
		ArrayList<Emp1map> employee2 = new ArrayList<Emp1map>();
		ArrayList<Emp1map> employee3 = new ArrayList<Emp1map>();
		for (int i = 0; i < employee.size(); i++) {
			if (employee.get(i).getSalary() <= 20000) {
				employee1.add(employee.get(i));
			} else if (employee.get(i).getSalary() > 20000 && employee.get(i).getSalary() <= 50000) {
				employee2.add(employee.get(i));
			} else {
				employee3.add(employee.get(i));
			}
		}
		salaryMap.put("fresher", employee1);
		salaryMap.put("engineer", employee2);
		salaryMap.put("lead", employee3);

		System.out.println(salaryMap);
		
		
		}

	    
}