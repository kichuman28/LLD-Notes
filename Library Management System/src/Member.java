import java.util.ArrayList;

public class Member {
    private String name;
    private int memberId;
    private ArrayList<Book> borrowedBooks;

    public Member(String name, int memberId){
        this.name = name;
        this.memberId = memberId;
        this.borrowedBooks = new ArrayList<>(); //Using array list here like a vector. Infinite pushes. List means I should initialise a size, which is not possible.
    }

    //Getters
    public String getMemberName(){
        return this.name;
    }

    public int getMemberId(){
        return this.memberId;
    }

    public ArrayList<Book> getBorrowedBooks(){
        return this.borrowedBooks;
    }

    //Function for adding a book
    public void addBorrowedBook(Book book){
        borrowedBooks.add(book);
    }

    public void removeBorrowedBook(Book book){
        borrowedBooks.remove(book);
    }

    @Override
    public String toString(){
        return "[" + memberId + "]" + name + " (" + borrowedBooks.size() + " books borrowed)";
    }
}
