package CNPM;

public class Intern extends Employee{
	private String Majors;
	private int Semester;
	private String Unversity_name;
	
	
	 public Intern(String id, String fullName, int birthDay, String phone, String email,
            String employeeType, int employeeCount, 
            String Majors, int Semester,String University_name) {
		 super(id, University_name, birthDay, phone, email, employeeType, employeeCount);
		 this.Majors = Majors;
		 this.Semester = Semester;
		 this.Unversity_name = University_name;
	 }
	public String getMajors() {
		return Majors;
	}
	public void setMajors(String majors) {
		Majors = majors;
	}
	public String getSemester() {
		return Semester;
	}
	public void setSemester(int semester) {
		Semester = semester;
	}
	public String getUniversity_name() {
		return Unversity_name;
	}
	public void setUniversity_name(String university_name) {
		Unversity_name = university_name;
	}
	
	@Override
    public void showInfor() {
        System.out.println("ID: " + ID);
        System.out.println("Name: " + fullName);
        System.out.println("birthday: " + birthDay);
        System.out.println("phone: " + phone);
        System.out.println("email: " + email);
        String type = "Experienced";
        if (employeeType == 1) type =  "Fresher";
        if (employeeType == 2) type =  "Intern";
        System.out.println("Employee Type: " + type);
        System.out.println("Majors: " + Majors);
        System.out.println("Semester: " + Semester);
        System.out.println("University: " + University_name);
    }

}