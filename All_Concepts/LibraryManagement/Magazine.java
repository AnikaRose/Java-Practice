package LibraryManagement;

public class Magazine extends LibraryItem implements Borrowable{
    private int issueNumber;
    private final double LateFee = 0.25;

    public Magazine(String itemId, String title, String author,int issueNumber) {
        super(itemId, title, author);
        this.issueNumber = issueNumber;
    }
    
     public void displayInfo(){
         System.out.println("Library Item: Magazine");
        super.displayInfo();
        System.out.println("Issue Number: " + issueNumber);
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
