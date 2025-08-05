import java.util.ArrayList;
import java.util.List;

public class Library {
    private String name;
    private List<Book> books;
    private List<Member> members;

    public Library(String name){
        this.name = name;
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    //Getters
    public String getLibraryName(){
        return this.name;
    }

    public List<Book> getBooks(){
        return this.books;
    }

    public List<Member> getMembers(){
        return this.members;
    }

    //Methods
    public void addBook(Book book){
        books.add(book);
    }

    public void registerMembers(Member member){
        members.add(member);
    }

    public List<Book> searchBook(String title){
        List<Book> results = new ArrayList<Book>();
        for(Book book : books){
            if(book.getBookTitle().toLowerCase().contains(title.toLowerCase())){
                results.add(book);
            }
        }
        return results;
    }

    public boolean borrowBook(Member member, Book book){
        if(book.isAvailable()){
            book.markAsBorrowed(book.getId(), member);
            member.addBorrowedBook(book);
            return true;
        }
        return false;    
    }

    public boolean returnBook(Member member, Book book){
        if(member.getBorrowedBooks().contains(book)){
            book.markAsReturned(book.getId(), member);
            member.removeBorrowedBook(book);
            return true;
        }
        return false;
    }
}
