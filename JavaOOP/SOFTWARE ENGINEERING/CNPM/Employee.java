package CNPM;

public abstract class Employee {
	private String id;
	protected String fullName;
    protected int birthDay;
    protected String phone;
    private String email;
    private String employeeType;
    private int employeeCount;
    
    
    public Employee(String id, String fullName, int birthDay, String phone, String email,
             String employeeType, int employeeCount) {
    	this.id = id;
    	this.fullName = fullName;
        this.birthDay = birthDay;
        this.email = email;
        this.phone = phone;
        this.employeeCount = employeeCount;
        this.employeeType = employeeType;
    }
    private String getID() {
		return id;
	}

	private void setId(String id) {
		this.id = id;
	}
	private int getBirthDay() {
		return birthDay;
	}
	private void setBirthDay(int birthDay) {
		this.birthDay = birthDay;
	}
	private String getPhone() {
		return phone;
	}
	private void setPhone(String phone) {
		this.phone = phone;
	}
	private String getEmail() {
		return email;
	}
	private void setEmail(String email) {
		this.email = email;
	}
	private String getEmployeeType() {
		return employeeType;
	}
	private void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}
	private int getEmployeeCount() {
		return employeeCount;
	}
	private void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public abstract void showInfor();
}

	