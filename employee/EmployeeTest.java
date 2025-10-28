package employee;

public class EmployeeTest {
    public static void main(String[] args) {
        employee Emp1 = new employee();
        Emp1.setName("Abdulla A");
        Emp1.setId(17);
        Emp1.setDepartment("CSE");
        Emp1.setSalary(15000.0);

        employee Emp2 = new employee();
        Emp2.setName("Anandu S");
        Emp2.setId(15);
        Emp2.setDepartment("CSE");
        Emp2.setSalary(18000.0);

        System.out.println("----Employee 1 Details:----");
        System.out.println("Employee Name: " + Emp1.getName());
        System.out.println("Employee ID: " + Emp1.getId());
        System.out.println("Employee Department: " + Emp1.getDepartment());
        System.out.println("Employee Salary: " + Emp1.getSalary());

        System.out.println("\n");


        System.out.println("----Employee 2 Details:----");
        System.out.println("Employee Name: " + Emp2.getName());
        System.out.println("Employee ID: " + Emp2.getId());
        System.out.println("Employee Department: " + Emp2.getDepartment());
        System.out.println("Employee Salary: " + Emp2.getSalary());

    }
}
