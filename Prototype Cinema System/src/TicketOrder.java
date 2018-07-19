import java.util.Scanner;

public class TicketOrder {
	static Scanner scan= new Scanner(System.in);
	public static int stdnumber;
	static int oapnumber;
	static int stunumber;
	static int chdnumber;
	static int discount;

public static void gettickets() {
	System.out.println("Choose your number of tickets"+"\n");
	System.out.println("Number of Standard Tickets:"); 
	stdnumber=scan.nextInt();
	System.out.println("Number of OAP Tickets:"); 
	oapnumber=scan.nextInt();
	System.out.println("Number of Student Tickets:"); 
	stunumber=scan.nextInt();
	System.out.println("Number of Child Tickets:"); 
	chdnumber=scan.nextInt();
//Used a scanner class to allow the user to enter the number of tickets they want for each ticket class
}
}
