import models.Books;
import models.Borrowing;
import models.Students;

public class Main {
    public static void main(String[] args) {

        Students st1 = new Students("Rahul Rai", 11, 1, 484);
        Students st2 = new Students("Mihir Upadhyay", 12, 1, 469);
        Students st3 = new Students("Daya Tamang", 11, 1, 475);

        Books b1 = new Books("Messenger", "Lois Lowry", 16675342, 2001, 13);
        Books b2 = new Books("And The Mountains Echoed", "Khaled Hosseini", 23005671, 2011, 41);
        Books b3 = new Books("The Hunger Games: Mockingjay", "Suzanne Collins", 46729454, 2008, 36);

        Borrowing br1 = new Borrowing(b1.getBookId(), 484, 5, 40);
        Borrowing br2 = new Borrowing(b2.getBookId(), 469, 2, 40);
        Borrowing br3 = new Borrowing(b3.getBookId(), 447, 7, 40);

        st1.getDetails();
        st2.getDetails();
        st3.getDetails();
        b1.getBookDetails();
        b2.getBookDetails();
        b3.getBookDetails();
        br1.getTotalFine();
        br2.getTotalFine();
        br3.getTotalFine();


    }
}