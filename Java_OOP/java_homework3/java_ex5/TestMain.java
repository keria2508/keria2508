package Java1.Ex5;

public class TestMain {
    public static void main(String[] args) {
        Employee employee1 = new Employee(8, "Peter", "Tan", 2500);
        System.out.println(employee1);

        employee1.setSalary(999);
        System.out.println(employee1);
        System.out.println("ID is: " + employee1.getId());
        System.out.println("firstName is: " + employee1.getFirstName());
        System.out.println("lastName is: " + employee1.getLastName());
        System.out.println("Salary is: " + employee1.getSalary());

        System.out.println("name is: " + employee1.getName());
        System.out.println("annual salary is: " + employee1.getAnnualSalary());

        System.out.println(employee1);
    }
}
