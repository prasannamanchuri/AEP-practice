package basic;
import java.util.HashMap;
import java.util.Map;

class Emp1map {
    private String name;
    private String lastname;
    private Integer salary;
    public Emp1map(String name, String lastname, Integer salary) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Emp1map [name=" + name + ", lastname=" + lastname + ", salary=" + salary + "]";
	}

	
}

