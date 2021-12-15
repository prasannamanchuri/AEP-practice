package basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Company {
	public static void main(String[] args) {
	/*ArrayList<Dept> dept=new ArrayList<Dept>(); 
	dept.add(new Dept(1,"cse"));
	dept.add( new Dept(2,"ece"));
	dept.add( new Dept(3,"eee"));
	dept.add( new Dept(4,"civil"));
	dept.add( new Dept(5,"mech"));

    System.out.println(dept);*/
    ArrayList<Emp1map> employee=new ArrayList<Emp1map>(); 
    Emp1map e1=new Emp1map("prasanna","manchuri",21800);
    employee.add(e1);
    Emp1map e2=new Emp1map( "John", "thomas",54767);
    employee.add( e2);
    Emp1map e3= new Emp1map( "Jack", "jill",9775);
    employee.add( e3);
    ArrayList<Emp1map> employee1=new ArrayList<Emp1map>(); 
    Emp1map e4=new Emp1map("hani","manchu",21800);
    employee1.add(e4);
    ArrayList<Emp1map> employee3=new ArrayList<Emp1map>(); 
    Emp1map e5=new Emp1map( "keer", "thomas",54767);
    employee3.add( e5);
    Emp1map e6= new Emp1map( "ravi", "jill",9775);
    employee3.add( e6);


   // System.out.println(employee);
    Map<Dept,ArrayList<Emp1map>> employeesMap = new HashMap<>();
    
    employeesMap.put( new Dept(1,"eee"),employee1);
    employeesMap.put( new Dept(3,"cse"),employee);
    employeesMap.put( new Dept(2,"ece"),employee3);
     System.out.println(employeesMap);
	}
   
    

}

