package registration ;

import registration.*;
import java.util.Scanner;

class Form {
    public static void main (String args[])
    {
        Scanner fname = new Scanner (System.in);
        System.out.println("Enter your first name: ");
        String firstname = fname.nextLine();
        Scanner age = new Scanner (System.in);
        System.out.println("Enter your age: ");
        int newAge = age.nextInt();
        
        System.out.println("Your name is " + firstname + " and your age is " + newAge);
        fname.close();
        age.close();
    }
}