import java.util.Scanner;

class StdList {
    int id;
    String name;

    StdList(int id, String name){
        this.id = id;
        this.name = name;
    }
}

public class FindStudent {
    public static void main(String[] args){
    
        StdList[] students = {
            new StdList(1, "Rajesh"),
            new StdList(2, "Rahul"),
            new StdList(3, "Sruthi")
        };
     
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Student ID to search:");
        int searchId = sc.nextInt();
        boolean found = false;
        for(StdList student : students){
            if(student.id == searchId){
                System.out.println("Student Found: " + student.name);
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("Student with ID " + searchId + " not found.");
        }
        sc.close();
    }
}