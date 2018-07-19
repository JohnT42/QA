public class Ticket {
   private String name;
   private int price;
//Used private access modifiers to restrict access to the ticket names and prices as part of encapsulation
   public int getPrice() {
      return price;
   }

   public String getName() {
      return name;
   }
 //Getter methods
   public void setPrice( int newPrice) {
      price = newPrice;
   }

   public void setName(String newName) {
      name = newName;
   }
//Setter methods
}