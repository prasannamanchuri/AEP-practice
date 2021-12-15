package CorejavaRevision;

public class Encapsulation {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setAddress("madanapalli");
		System.out.println(e.getAddress());
		System.out.println(e.getName());
		Student s = new Student("hani","mpl");
		System.out.println(s.getName());

	}

}

class Employee {
	private String name = "prasanna";
	private String address;

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}

class Student {
	private String name;
	private String address;

	public Student(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	
		
		
	}
	

	public String getName() {
		return name;
	}


	public String getAddress() {
		return address;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + "]";
	}
	
}