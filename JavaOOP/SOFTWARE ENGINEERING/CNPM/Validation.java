package CNPM;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Validation {
	public static final Pattern VALID_EMAIL_ADDRESS_REGEX
    = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

	static Scanner sc = new Scanner(System.in);
	static ArrayList<Employee> EmployeeList = new ArrayList<>();
	static ArrayList<ArrayList<Certificate>> CerList = new ArrayList<ArrayList<Certificate>>();
	static int eLen, cLen;

	static boolean validEmail(String email) {
		Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
		return matcher.find();
	}

	static boolean validPhone(String phone) {
			// (03|5|7|8|9) + 8so 0-> 9
			//regex : [0[35789]\\d]
		return phone.matches("0[35789]\\d{8}$");
	}

	static boolean validDate(String date) {
		SimpleDateFormat fm = new SimpleDateFormat("dd-MM-yyyy");
		try {
			fm.parse(date);
			return true;
		} catch (ParseException e) {
			return false;
		}
	}

	static boolean validName(String Name) {
		return Name.matches("^[a-zA-Z\\s]+");
	}

		protected static void Input(int index, int type) {
			System.out.print("Enter employeeType: ");
			int employeeType = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter ID: ");
			String ID = sc.nextLine();
			System.out.print("Enter fullName: ");
			String fullName = sc.nextLine();
			while (!validName(fullName)) {
				System.out.print("Invalid Name! Re-enter: ");
				fullName = sc.nextLine();
			}
			System.out.print("Enter birthDay:(dd-MM-yyyy) ");
			String birthDay = sc.nextLine();
			while (!validDate(birthDay)) {
				System.out.print("Invalid birthday! Re-enter: ");
				birthDay = sc.nextLine();
			}
			System.out.print("Enter phone: ");
			String phone = sc.nextLine();
			while (!validPhone(phone)) {
				System.out.print("Invalid Phone! Re-enter: ");
				phone = sc.nextLine();
			}
			System.out.print("Enter Email: ");
			String email = sc.nextLine();
			while (!validEmail(email)) {
	    System.out.print("Invalid email! Re-enter: ");
	    email = sc.nextLine();
	}
	Employee t;
	if (employeeType == 0) {
	    System.out.print("Enter Exp year: ");
	    int exp = sc.nextInt();
	    sc.nextLine();
	    System.out.print("Enter ProSkill: ");
	    String skill = sc.nextLine();
	    t = new Experience(exp, skill, ID, fullName, birthDay, phone, email, employeeType, eLen);
	
	} else if (employeeType == 1) {
	    System.out.print("Enter graduation date: ");
	    int date = sc.nextInt();
	    sc.nextLine();
	    System.out.print("Enter graduation rank: ");
	    String rank = sc.nextLine();
	    System.out.print("Enter Education: ");
	    String education = sc.nextLine();
	    //public Fresher(int Graduation_date, String Graduation_rank, String Education, String ID, String fullName, String birthDay, String phone, String email, int employeeType, int employeeCount) {
	    t = new Fresher(date, rank, education, ID, fullName, birthDay, phone, email, employeeType, eLen);
	
	} else {
	    System.out.print("Enter majors: ");
	    String a = sc.nextLine();
	    System.out.print("Enter semester: ");
	    int b = sc.nextInt();
	    sc.nextLine();
	    System.out.print("Enter university_name: ");
	    String c = sc.nextLine();
	    t = new Intern(a, c, b, ID, fullName, birthDay, phone, email, employeeType, eLen);
	}
	
	// add certificate by index
	System.out.println("");
	System.out.print("Enter the number certificate of " + fullName + ": ");
	cLen = sc.nextInt();
	sc.nextLine();
	ArrayList<Certificate> temp = new ArrayList<>();
	for (int k = 0; k < cLen; k++) {
	    System.out.println("Certificate " + (k + 1) + ": ");
	    System.out.print("Enter certificatedID: ");
	    String cID = sc.nextLine();
	    System.out.print("Enter certificateName: ");
	    String cName = sc.nextLine();
	    System.out.print("Enter certificateRank: ");
	    String cRank = sc.nextLine();
	    System.out.print("Enter certificatedDate: ");
	    String cDate = sc.nextLine();
	    temp.add(new Certificate(cID, cName, cRank, cDate));
	    System.out.println("");
	}
	
	if (type == 1) {
	    CerList.add(temp);
	    EmployeeList.add(t);
	} else {
	    EmployeeList.set(index, t);
	    CerList.set(index, temp);
	
	}
	
	}
	
	protected static void addEmployee() {
	System.out.print("Enter the number of employees: ");
	eLen = sc.nextInt();
	for (int i = 0; i < eLen; i++) {
	    System.out.println("Empoyee " + (i + 1) + ": ");
	    Input(0,1);
	}
	
	}
	
	protected static void updateEmployee() {
	System.out.print("Enter the id u want to search: ");
	String ID = sc.nextLine();
	boolean check = false;
	int index = 0;
	for (int i = 0; i < eLen; i++) {
	    Employee t = EmployeeList.get(i);
	    if (t.getID().equals(ID)) {
	        check = true;
	        index = i;
	        break;
	    }
	}
	if (check) {
	    Input(index, 2);
	    System.out.println("Update success!");
	
	} else {
	    System.out.println("ID does not exits");
	}
	
	}
	
	protected static void delEmployee() {
	System.out.print("Enter the id u want to delete: ");
	String ID = sc.nextLine();
	boolean check = false;
	int index = 0;
	for (int i = 0; i < eLen; i++) {
	    Employee t = EmployeeList.get(i);
	    if (t.getID().equals(ID)) {
	        check = true;
	        index = i;
	        break;
	    }
	}
	if (check) {
	    EmployeeList.remove(index);
	    eLen--;
	    if (cLen > 0) {
	        CerList.remove(index);
	        cLen--;
	    }
	
	    System.out.println("delete success!");
	} else {
	    System.out.println("ID does not exits!");
	}
	}
	
	protected static void Search() {
	while (true) {
	    System.out.print("Enter EmployeeType : ");
	    int type = sc.nextInt();
	    sc.nextLine();
	    if (type > 2) {
	        System.out.println("Invalid EmployeeType! Re-enter:");
	        continue;
	    }
	    int dem = 0;
	    for (int i = 0; i < EmployeeList.size(); i++) {
	        Employee tmp = EmployeeList.get(i);
	        if (tmp.getEmployeeType() == type) {
	            tmp.showInfor();
	            dem++;
	        }
	    }
	    if (dem == 0) {
	        System.out.println("No employee found!");
	    }
	    break;
	}
	
	}
	
	public static void main(String[] args) {
	// TODO code application logic here
	while (true) {
	    System.out.println("Vui lòng chọn chức năng: ");
	    System.out.println("'1': Thêm nhân viên mới");
	    System.out.println("'2': Cập nhật thông tin nhân viên");
	    System.out.println("'3': Xoá nhân viên theo ID");
	    System.out.println("'4': Tìm nhân viên theo EmployeeType: ");
	    System.out.println("Nhấn nút bất kì còn lại để thoát");
	    System.out.print("Typing...: ");
	    String type = sc.nextLine();
	
	    switch (type) {
	        case "1":
	            addEmployee();
	            break;
	        case "2":
	            updateEmployee();
	            break;
	        case "3":
	            delEmployee();
	            break;
	        case "4":
	            Search();
	            break;
	        default:
	            System.exit(0);
	    }
	}
}


