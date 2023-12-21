package CNPM;

public class Experienced extends Employee {
	private static final String ID = null;
    private int ExpInYear;
    private String ProSkill;
    
    
    public Experienced(String id, String fullName, int birthDay, String phone, String email, String employeeType, int employeeCount, 
    		int ExpInYear, String ProSkill)
    {
    	super(id, fullName, birthDay, phone, email, ProSkill, ExpInYear);
        this.ExpInYear= ExpInYear;
        this.ProSkill = ProSkill;
    }
	public int getExpInYear() {
		return ExpInYear;
	}
	public void setExpInYear(int ExpInYear) {
		ExpInYear = ExpInYear;
	}
	public String getProSkill() {
		return ProSkill;
	}
	public void setProSkill(String ProSkill) {
		ProSkill = ProSkill;
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
        System.out.println("Experience: " +ExplnYear + " Year");
        System.out.println("ProSkill: " + ProSkill);
    }
}
