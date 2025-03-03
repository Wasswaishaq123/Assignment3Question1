import java.util.ArrayList;
import java.util.List;

public class Member {
    public String name;
    private String memberId;
    private List<Book> borrowedBooks= new ArrayList<>();

    public Member(String name,String memberId){
        this.name=name;
        this.memberId=memberId;
    }
    public String getMemberId(){
        return memberId;
    }
    public void borrowBook(Book book){
        if(book.getCopiesAvailable()>0){
        addBookToBorrowedList(book);
    }
    private void addBookToBorrowedList(Book book){
        borrowedBooks.add(book);
        book.setcopiesAvailable(book.get-copiesAvailable()-1);
    }else{
            System.out.println("No copies available for "+ book.title);

        }
}
private void addBookToBorrowedList(Book book) {
        this.borrowedBooks.add(book);
    System.out.println("Book borrowed:"+ book.title);

    }
}

