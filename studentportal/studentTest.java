package studentportal;

public class studentTest {
    public static void main(String[] args) {
        student stu1 = new student();
        stu1.setName("Adithyan");
        stu1.setRollNo(101);
        stu1.setPercentage(89.5);   

        System.out.println("----Student Details----");
        System.out.println("Student Name: " + stu1.getName());
        System.out.println("Student Roll No: " + stu1.getRollNo()); 
        System.out.println("Student Percentage: " + stu1.getPercentage());
    }
}