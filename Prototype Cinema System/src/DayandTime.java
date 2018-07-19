import java.util.Scanner;

	public class DayandTime {
		
		static Scanner scan= new Scanner(System.in);
		static String[] daysoftheweek = {"1) Monday","2) Tuesday","3) Wednesday","4) Thursday", "5) Friday", "6) Saturday", "7) Sunday"};
		static String[] timeofday = {"1) 9:00","2) 10:30","3) 12:00","4) 14:00", "5) 15:30", "6) 17:00", "7) 18:00", "8) 19:30", "9) 21:00", "10) 22:00", "11) 23:30"};
		static int daynumber;
		static int timenumber;
		
	public static void getdayandtime() {
	System.out.println("Please choose a day");
	for (int i=0;i<daysoftheweek.length;i++) {
	System.out.println(daysoftheweek[i]);
	}
	System.out.println("Enter the corresponding number for the day:"); 
	daynumber=scan.nextInt();
//Used a scanner class to allow the user to choose the day of the week for which they are booking tickets for	
	
	System.out.println("Please choose a time");
	for (int i=0;i<timeofday.length;i++) {
	System.out.println(timeofday[i]);
	}
	System.out.println("Enter the corresponding number for the time:"); 
	timenumber=scan.nextInt();
//Used a scanner class to allow the user to choose the time of time for which they are booking the tickets for	
	
	System.out.println("Now booking for "+daysoftheweek[daynumber-1].substring(3, daysoftheweek[daynumber-1].length())+" at "+timeofday[timenumber-1].substring(3, timeofday[timenumber-1].length())+"\n");
	}
	}
		
