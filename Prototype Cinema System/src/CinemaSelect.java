import java.util.Scanner;

	public class CinemaSelect {
		
		static Scanner scan= new Scanner(System.in);
		static String[] cinemalist = {"1) Manchester","2) London","3) Leeds","4) Birmingham","5) Newcastle","6) Liverpool","7) Manchester Trafford Centre","8) Glasglow"};
		static int cinemanumber;
		
	public static void getCinema() {
	System.out.println("Please Choose your Venue"+"\n");
	for (int i=0;i<cinemalist.length;i++) {
	System.out.println(cinemalist[i]);
	}
	System.out.println("Enter the corresponding number for the venue:"); 
	cinemanumber=scan.nextInt();
	//Used a scanner class to allow the user to the Venue for which they are booking tickets for	

	System.out.println("You have chosen "+cinemalist[cinemanumber-1].substring(3, cinemalist[cinemanumber-1].length())+" as your venue."+"\n");
	}

}
