package CorejavaRevision;

class Job {
	private String role;
	private long salary;
	private int id;

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}

public class PersonComposition {
	private Job job;
	public String name;

	public PersonComposition() {
		this.job = new Job();
		job.setSalary(1000L);
		this.name = "prasanna";
	}

	public long getSalary() {
		return job.getSalary();

	}

	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		PersonComposition person = new PersonComposition();
		long salary = person.getSalary();
		System.out.println(person.getName()+": "+salary);
	}

}
