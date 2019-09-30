package companyInfo;

// Bean or Model or POJO(plain Old Java Object) 
public class Employee {
	// attributes
	int eid;
	String ename;
	String address;
	char gender;
	
	// Methods, constructor, getter and setter 
	// default one
	public Employee() {
		
	}
	
	// constructor with parameters 

	public Employee(int eid, String ename, String address, char gender) {
		this.eid = eid;
		this.ename = ename;
		this.address = address;
		this.gender = gender;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", address=" + address + ", gender=" + gender + "]";
	}
	
	public void myInit() {
		System.out.println("object Initialized");
		
		
	}
	
	public void myDestroy() {
		System.out.println("object Destroyed");
		
		
	}	
	

}



