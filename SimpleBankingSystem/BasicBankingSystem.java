package SimpleBankingSystem;

import java.util.Scanner;

public class BasicBankingSystem {
    public static void main(String[] args) {
        String name="";
        int age=0;
        double pno=0;
        double balance=0;
        double amount=0;
        double withdraw=0;
    
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("Select the operation: \n 1.Create account \n 2.Deposit money \n 3.Withdraw money \n 4.Print Account Details");
            int num = sc.nextInt(); 
            sc.nextLine();

            switch (num) {
                case 1:
                    System.out.print("Enter your name: ");
                    name = sc.nextLine();
                    System.out.print("Enter your age: ");
                    age = sc.nextInt();
                    System.out.print("Enter your mobile number: ");
                    pno = sc.nextDouble();
                    System.out.println("Account Created Successfully!");
                    break;

                case 2:
                    if (name.equals("")) {
                        System.out.println("Please create an account first.");
                    } else {
                        System.out.print("Enter the amount to be deposited: ");
                        amount = sc.nextDouble();
                        balance += amount;
                        System.out.println("Amount Deposited Successfully!");
                    }
                    break;

                case 3:
                    if (name.equals("")) {
                        System.out.println("Please create an account first.");
                    } else {
                        System.out.print("Enter the amount to withdraw: ");
                        withdraw = sc.nextDouble();
                    
                        if (withdraw > balance) {
                            System.out.println("Insufficient balance!");
                        } else if (balance - withdraw < 3000) {
                            System.out.println("You must maintain a minimum balance of 3000.");
                        } else {
                            balance -= withdraw;
                            System.out.println("Withdrawal Successful!");
                            System.out.println("Remaining Balance: " + balance);
                        }
                    }
                    break;

                case 4:
                    if (name.equals("")) {
                        System.out.println("Please create an account first.");
                    } else {
                        System.out.println("Account Details: ");
                        System.out.println("Name: " + name);
                        System.out.println("Age: " + age);
                        System.out.println("Mobile Number: " + pno);
                        System.out.println("Balance: " + balance);
                    }
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
            sc.close();
        }
    }
}
