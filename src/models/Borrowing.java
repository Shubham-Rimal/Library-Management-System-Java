package models;

public class Borrowing {
    int bookId;
    int studentId;
    int extraDays;
    int fineRate;

    public int getTotalFine() {
        int fine = this.fineRate*this.extraDays;
        System.out.println("The total fine for book id "+this.bookId+" for "+this.extraDays+" extra days is Rs."+fine+".\n");
        return totalFine;
    }

    public void setTotalFine(int totalFine) {
        this.totalFine = totalFine;
    }

    int totalFine;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getExtraDays() {
        return extraDays;
    }

    public void setExtraDays(int extraDays) {
        this.extraDays = extraDays;
    }

    public int getFineRate() {
        return fineRate;
    }

    public void setFineRate(int fineRate) {
        this.fineRate = fineRate;
    }

    public Borrowing(int bookId, int studentId, int extraDays, int fineRate) {
        this.bookId = bookId;
        this.studentId = studentId;
        this.extraDays = extraDays;
        this.fineRate = fineRate;
        this.totalFine = totalFine;
    }
}
