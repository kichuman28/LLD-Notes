import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in); 


        Library lib = new Library("VK Library");
        Book HarryPotter = new Book(1, "Harry Potter", "JK Rowling");
        Book TheSilentPatient = new Book(2, "The Silent Patient", "Someone");
        Book ProjectHailMary = new Book(3, "Project Hail Mary", "Andy Weir");
        lib.addBook(HarryPotter);
        lib.addBook(TheSilentPatient);
        lib.addBook(ProjectHailMary);


        int memberSize = 0;        
        while(true){
            System.out.println("Welcome to VK Library, choose your options");
            System.out.println("1. Register as a member");
            System.out.println("2. Search books");
            System.out.println("3. Borrow a book");
            System.out.println("4. Return a book");
            System.out.println("5. Exit");
            System.out.println("Enter option");
            int option = reader.nextInt();
            reader.nextLine(); 

            if(option == 1){
                memberSize = memberSize + 1;
                System.out.println("Enter your name");
                String memberName = reader.nextLine();
                Member newMember = new Member(memberName, memberSize);
                lib.registerMembers(newMember);
                System.out.println("You have succesfully registered!");                
            }else if(option == 2){
                System.out.println("Enter the name of the book you want to search");
                String bookName = reader.nextLine();
                List<Book> results = lib.searchBook(bookName);
                if(results.isEmpty()){
                    System.out.println("No books found");
                }else{
                    for(Book book : results){
                        System.out.println(book);
                    }
                }
            }else if(option == 3){
                System.out.println("Enter your member ID");
                int memberID = reader.nextInt();
                System.out.println("Enter your book ID");
                int bookID = reader.nextInt();
                for(Member member : lib.getMembers()){
                    if(member.getMemberId() == memberID){
                        for(Book book : lib.getBooks()){
                            if(book.getId() == bookID){
                                lib.borrowBook(member, book);
                                System.out.println("You have successfully borrowed the book");
                                break;
                            }else{
                                System.out.println("No such book available");
                            }
                        }
                    }else{
                        System.out.println("You have not registered. Please register as a member");
                    }
                }  
            }else if(option == 4){
                System.out.println("Enter your member ID");
                int memberID = reader.nextInt();
                System.out.println("Enter your book ID");
                int bookID = reader.nextInt();
                for(Member member : lib.getMembers()){
                    if(member.getMemberId() == memberID){
                        for(Book book : lib.getBooks()){
                            if(book.getId() == bookID){
                                lib.returnBook(member, book);
                                System.out.println("You have successfully returned the book");
                                break;
                            }else{
                                System.out.println("No such book available");
                            }
                        }
                    }else{
                        System.out.println("You have not registered. Please register as a member");
                    }
                }                
            }else{
                break;
            }
        }


        reader.close();
    }   
}