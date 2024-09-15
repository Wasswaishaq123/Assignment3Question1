public class Main {
    public static void main(String[]args){
        Library library=new Library();
        Book book1=new Book("Book1","Author1","ISBN1",2);

        library.addBook(book1);
        library.addBook(book2);

        Member member1= new Member("Wasswa Isaac","CM2023");
        Member member2= new Member("Kato Ismail","CM2022");

        library.registerMember(member1);
        library.registerMember(member2);

        library.lendBook("ISBN1","M123");
        library.lendBook("ISBN2","M2345");
        library.lendBook("ISBN1","M1098");
    }
}
