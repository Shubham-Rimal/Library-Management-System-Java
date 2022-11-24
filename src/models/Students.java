package models;

public class Students {
    String name;
    int grade;
    int borrowedBooks;
    int studentId;

    int details;

    public int getDetails() {
        System.out.println("The student "+this.name+" of class "+this.grade+" has borrowed "+this.borrowedBooks+" books.\n\n");
        return details;
    }

    public void setDetails(int details) {
        this.details = details;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(int borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public Students(String name, int grade, int borrowedBooks, int studentId) {
        this.name = name;
        this.grade = grade;
        this.borrowedBooks = borrowedBooks;
        this.studentId = studentId;
        this.details = details;
    }
}
