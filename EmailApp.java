package EmailApp;

public class EmailApp{

    public static void main(String[] args)
    {
        //Creates an email for John Smith
        Email em1 = new Email("John", "Smith");

        //Set his mailbox to 500 in megabytes
        em1.setMailBoxCapacity(500);

        //Sets the alternate email to js@gmail.com
        em1.setAlternateEmail("js@gmail.com");

        //Prints it out
        System.out.print(em1.getAlternateEmail());

        //Shows the user's info
        System.out.println(em1.showInfo());
    }

}
