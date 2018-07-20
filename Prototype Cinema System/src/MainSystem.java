public class MainSystem {
	
	public static void getcalculations() {
		      Ticket standard = new Ticket();
		      standard.setName("Standard");
		      standard.setPrice(8);
		      
		      Ticket oap = new Ticket();
		      oap.setName("OAP");
		      oap.setPrice(6);
		      
		      Ticket student = new Ticket();
		      student.setName("Student");
		      student.setPrice(6);
		      
		      Ticket child = new Ticket();
		      child.setName("Child");
		      child.setPrice(4);
//Used setter methods to set the ticket prices for each ticket type
		      
		      System.out.println("Ticket Prices for all the movies follows:");
		      System.out.print(standard.getName() + " Price : £" + standard.getPrice()+"\n");
		      System.out.print(oap.getName() + " Price : £" + oap.getPrice()+"\n");
		      System.out.print(student.getName() + " Price : £" + student.getPrice()+"\n");
		      System.out.print(child.getName() + " Price : £" + child.getPrice()+"\n");
		      System.out.print("\n");
		      //Displays the ticket name and prices for the user through the user of getter methods		      
		
		      TicketOrder.gettickets();
			
		int totalcost = TicketOrder.stdnumber*standard.getPrice()+TicketOrder.oapnumber*oap.getPrice()+TicketOrder.stunumber*student.getPrice()+TicketOrder.chdnumber*child.getPrice();
			int totaltkt=TicketOrder.stdnumber+TicketOrder.oapnumber+TicketOrder.stunumber+TicketOrder.chdnumber;
			int totalplusdiscount = totalcost-totaltkt*Discount.discountoffer();
			// This method returns the total cost of tickets with discount included within the final price
			
			System.out.println("The total cost of "+totaltkt+" tickets for "+FilmSelect.filmlist[FilmSelect.filmnumber-1].substring(3, FilmSelect.filmlist[FilmSelect.filmnumber-1].length())+" is £"+totalplusdiscount+".");
			//This displays the total cost with discount as well as the name of the film for which they are buying tickets for.
	}

	public static void main(String[] args) {
		CinemaSelect.getCinema();
		FilmSelect.getFilm();
		DayandTime.getdayandtime();
		Discount.discountoffer();
		getcalculations();
	}
}

