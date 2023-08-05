package classes;

public class Libary {
    Student[] students = new Student[10];
    Book[] books = new Book[10];
    int bookIndex = -1;
    int studentIndex = -1;

    public void addStudent(Student student) {
        studentIndex++;
        students[studentIndex] = student;

    }

    public void addBook(Book book) {
        bookIndex++;
        books[bookIndex] = book;

    }

    public void countStudent() {
        System.out.println("There are " + (studentIndex + 1) + "students in the libary");
    }

    public void issueBook(String bookName, String studentName) {

        Book desiredBook = null;
        Student desiredStudent = null;

        for (int i = 0; i <= bookIndex; i++) {
            if (books[i].book == bookName) {
                desiredBook = books[i];
            }
        }
        if (desiredBook == null)
            System.out.println("No book found named " + bookName);
        else {
            if (desiredBook.issuer == null) {
                for (int i = 0; i <= studentIndex; i++) {
                    if (students[i].name == studentName) {
                        desiredStudent = students[i];
                    }

                }
                if (desiredStudent == null)
                    System.out.println("Sorry! you are not registred");
                else {
                    desiredBook.issuer = desiredStudent;
                    System.out.println("Congrats you have issued the book");
                }

            } 
            else
                System.out.println("Sorry!, the book is already issued by somebody");
        }

    }
}
