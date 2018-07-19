public class Discount {
	static int discount;
	public static int discountoffer() {
		int a=3;
		if (DayandTime.daynumber == a) {discount=2;
		}
		else {discount=0;
		}
		return discount;
	}
	// Discount is calculated depending on what day the tickets are booked for which is made possible by using the IF statement. 
	// If it is a Wednesday: the discount offer is 2
	// If it is a day other than Wednesday: the discount offer will be 0

}
