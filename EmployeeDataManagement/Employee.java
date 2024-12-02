package EmployeeDataManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
   public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc=new Scanner(System.in);
    ArrayList<Integer> id=new ArrayList<>();
    ArrayList<String> name=new ArrayList<>();
    ArrayList<String> department=new ArrayList<>();
   
   while(true){
    System.out.println("\n 1.Adding a new Employee \n 2. Deleting an employee by ID \n 3.Searching for an employee by name \n 4.Displaying all employee details");
    int num=sc.nextInt();
    sc.nextLine();
    switch (num) {
        case 1:
            System.out.println("Enter the Id of Employee:");
            id.add(sc.nextInt());
            sc.nextLine(); 
            System.out.println("Enter the Employee Name: ");
            name.add(sc.nextLine());
            System.out.println("Enter the Department: ");
            department.add(sc.nextLine());
            System.out.println("Employee Added Successfully!");
            break;

        case 2:
            System.out.println("Enter the Employee Id to delete: ");
            int deleteId = sc.nextInt();
            sc.nextLine(); 
            boolean foundId = false;
        
            for (int i = 0; i < id.size(); i++) {
                if (id.get(i) == deleteId) {
                    id.remove(i);
                    name.remove(i);
                    department.remove(i);
                    System.out.println("Employee with ID " + deleteId + " has been deleted successfully.");
                    foundId = true;
                    break;
                }
            }
            
            if (!foundId) {
                System.out.println("Employee with ID " + deleteId + " not found.");
            }
            break;

        case 3:
            System.out.println("Enter the Employee Name to search: ");
            String searchName = sc.nextLine();
            boolean employeeFound = false;
            
            for (int i = 0; i < name.size(); i++) {
                if (name.get(i).equalsIgnoreCase(searchName)) {
                    System.out.println("Employee Found: ");
                    System.out.println("ID: " + id.get(i) + ", Name: " + name.get(i) + ", Department: " + department.get(i));
                    employeeFound = true;
                    break;
                }
            }
            
            if (!employeeFound) {
                System.out.println("Employee with name " + searchName + " not found.");
            }
            break;

        case 4:
            if (id.isEmpty()) {
                System.out.println("No employee data available.");
            } else {
                System.out.println("Displaying all employee details: ");
                for (int i = 0; i < id.size(); i++) {
                    System.out.println("ID: " + id.get(i) + ", Name: " + name.get(i) + ", Department: " + department.get(i));
                }
            }
            break;

        default:
            System.out.println("Invalid option. Please select a valid option.");
            break;
    }
   }
 }
}
