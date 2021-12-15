package CorejavaRevision;
class Address {  
String city,state,country;  
  
public Address(String city, String state, String country) {  
    this.city = city;  
    this.state = state;  
    this.country = country;  
}  
  
}  

public class EmployeeAgregation {
	int id;  
	String name;  
	Address address;  
	public EmployeeAgregation(int id, String name,Address address) {
		this.id = id;  
	    this.name = name;  
	    this.address=address;  
	}
	void display(){  
		System.out.println(id+" "+name);  
		System.out.println(address.city+" "+address.state+" "+address.country);  
		}  
		  
		public static void main(String[] args) {  
		Address address1=new Address("Mpl","AndhraPradesh","India");  
		Address address2=new Address("Angallu","AndhraPradesh","India");  
		  
		EmployeeAgregation e=new EmployeeAgregation(1,"prasanna",address1);  
		EmployeeAgregation e2=new EmployeeAgregation(2,"bhanu",address2);  
		      
		e.display();  
		e2.display();  
		      
		}  
} 
