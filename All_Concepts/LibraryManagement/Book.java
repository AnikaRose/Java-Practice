package LibraryManagement;

public class Book extends LibraryItem implements Borrowable{
    private int NumberOfPages;
    private final double LateFee = 0.50;

    public Book(String itemId, String title, String author, int NumberOfPages) {
        super(itemId, title, author);
        this.NumberOfPages = NumberOfPages;
    }
    
    public void displayInfo(){
        System.out.println("Library Item: Book");
        super.displayInfo();
        System.out.println("Pages: " + NumberOfPages);
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
