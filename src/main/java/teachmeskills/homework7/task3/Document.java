package teachmeskills.homework7.task3;

import java.util.Date;

public abstract class Document {
    private int number;
    private Date date;

    public Document(int number, Date date) {
        this.number = number;
        this.date = date;
    }

    public int getNumber() {
        return number;
    }

    public Date getDate() {
        return date;
    }

    public abstract String toString();
}
