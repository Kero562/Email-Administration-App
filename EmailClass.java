package EmailApp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String department;
    private int mailboxCapacity;
    private int DefaultPasswordLength = 10;
    private String alternateEmail;
    private String companySuffix = "aeycompany.com";

    //Constructor -- Receives the first and last names
    public Email(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;

        // Call a method asking for the department and return it
        this.department = setDepartment();

        //Call a method that returns a random password from a predefined set of characters
        this.password = randomPassword(DefaultPasswordLength);
        System.out.println("Your password is " + password);

        //Combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
    }

    //Asks for the department
    private String setDepartment()
    {
        System.out.print("New worker: " + firstName + "\nDepartment Codes:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter your department code: ");
        Scanner scan = new Scanner(System.in);
        int depChoice = scan.nextInt();
        scan.close();
        if (depChoice == 1) {
            return "sales";
        } else if (depChoice == 2){
            return "dev";
        } else if (depChoice == 3)
        {
            return "acct";
        } else {
            return "";
        }
    }

    //Generate a random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUWVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++)
        {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    //Set the mailbox capacity
    public void setMailBoxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    //Set the alternate email
    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    //Change the password
    public void changePassword(String password) {
        this.password = password;
    }

    ////Getter functions for the variables

    public int getMailBoxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }
    ////

    //Shows the user's info; First and last names, the company email, and mailbox capacity
    public String showInfo() {
        return "\n\nDISPLAY NAME : " + firstName + " " + lastName +
                "\nCOMPANY EMAIL: " + email +
                "\nMAILBOX CAPACITY: " + mailboxCapacity + " MB";
    }
}
