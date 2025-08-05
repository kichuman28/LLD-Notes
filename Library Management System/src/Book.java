public class Book {
    private int bookId;
    private String title;
    private String author;
    private Boolean isAvailable;
    private Member borrowedBy;

    public Book(int bookId, String title, String author){
        this.bookId = bookId;
        this.author = author;
        this.title = title;
        this.isAvailable = true;
        this.borrowedBy = null;
    }


    //Define the getters
    public int getId(){
        return bookId;
    }

    public String getBookTitle(){
        return title;
    }

    public String getBookAuthor(){
        return author;
    }

    public boolean isAvailable(){
        return isAvailable;
    }

    public Member getBorrowedBy(){
        return borrowedBy;
    }

    //Mark the book as borrowed
    public void markAsBorrowed(String bookId, Member member){
        this.isAvailable = false;
        this.borrowedBy = member;
    }

    //Mark the book as returned
    public void markAsReturned(String bookId, Member member){
        this.isAvailable = true;
        this.borrowedBy = null;
    }

    //An Override method to print the book details in a specific format
    @Override
    public String toString(){
        return "[" + bookId + "]" + title + "by" + author; 
    }
}
