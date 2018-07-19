import java.util.Scanner;

public class FilmSelect {
	
	static Scanner scan= new Scanner(System.in);
	static String[] filmlist = {"1) Bumblebee","2) Antman and The Wasp","3) The Incredibles 2","4) Spider-Man: Far From Home","5) Aquaman"};
	static int filmnumber;
	
public static void getFilm() {
System.out.println("Please Select a Film"+"\n");
for (int i=0;i<filmlist.length;i++) {
System.out.println(filmlist[i]);
}
System.out.println("Enter the corresponding number for the Selected Film:");
filmnumber=scan.nextInt();
System.out.println("You are now booking for the film "+filmlist[filmnumber-1].substring(3, filmlist[filmnumber-1].length())+"\n");
}
//Used a scanner class to allow the user to choose the film for which they will buy tickets for

}