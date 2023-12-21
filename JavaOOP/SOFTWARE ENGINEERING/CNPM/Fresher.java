package CNPM;

public class Fresher extends Employee{
	private int Graduation_date;
    private String Graduation_rank;
    private String Education;
    
        public Fresher(String id, String fullName, int birthDay, String phone, String email,
            String employeeType, int employeeCount, int Graduation_date, String Graduation_rank, String Education)
    {
    	super(id, Education, birthDay, phone, email, employeeType, employeeCount);
        this.Education = Education;
        this.Graduation_date = Graduation_date;
        this.Graduation_rank = Graduation_rank;
    }
    public int getGraduation_date() {
		return Graduation_date;
	}
	public void setGraduation_date(int graduation_date) {
		Graduation_date = graduation_date;
	}
	public String getGraduation_rank() {
		return Graduation_rank;
	}
	public void setGraduation_rank(String graduation_rank) {
		Graduation_rank = graduation_rank;
	}
	public String getEducation() {
		return Education;
	}
	public void setEducation(String education) {
		Education = education;
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
        System.out.println("Graduation date: " + Graduation_date);
        System.out.println("Rank: " + Graduation_rank);
        System.out.println("Education: " + Education);
    }
}
	