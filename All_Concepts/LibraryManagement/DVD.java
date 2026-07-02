package LibraryManagement;

public class DVD extends LibraryItem implements Borrowable {
    private int duration;
    private final double LateFee = 1.00;

    public DVD(String itemId, String title, String author, int duration) {
        super(itemId, title, author);
        this.duration = duration;
    }

    @Override
    public void displayInfo(){
        System.out.println("Library Item: DVD");
        super.displayInfo(); 
        System.out.println("Duration: " + duration);
    }
    public double calculateLateFee(int daysLate) {
      return LateFee * daysLate ;
    }
    
     public void borrowItem(){
         System.out.println("Item borrowed successfully.");
     }
     
     public void returnItem(){
         System.out.println("Item returned successfully.");
     }
    
    
}
