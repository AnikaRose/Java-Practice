package LibraryManagement;

public abstract class LibraryItem {
    protected String itemId;
    protected String title;
    protected String author;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }
    public void displayInfo(){
        System.out.println("Id: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("author" + author);
    }
    
    public abstract double  calculateLateFee(int daysLate);
    
    
}
