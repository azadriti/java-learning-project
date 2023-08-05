import classes.Book;
import classes.Libary;
import classes.Student;

public class App {
    public static void main(String[] args) throws Exception {
        // Creating two students
        var riti = new Student("Riti");
        var raina = new Student("Raina");

        // Creating two books
        var dsa = new Book("DSA", null);
        var history = new Book("History", null);

        // Creating the libary

        var gmitLibary = new Libary();
        
        gmitLibary.addBook(dsa);
        gmitLibary.addBook(history);
        

        gmitLibary.addStudent(riti);
        gmitLibary.addStudent(raina);

        gmitLibary.issueBook(dsa.book, riti.name);
        gmitLibary.issueBook(history.book,raina.name);

    }
}
