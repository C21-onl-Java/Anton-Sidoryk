package teachmeskills.homework7.task3;

import java.util.Date;

public class FinancialInvoice extends Document {
    private double totalAmount;
    private int departmentCode;

    public FinancialInvoice(int number, Date date, double totalAmount, int departmentCode) {
        super(number, date);
        this.totalAmount = totalAmount;
        this.departmentCode = departmentCode;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public int getDepartmentCode() {
        return departmentCode;
    }

    public String toString() {
        return "FinancialInvoice [number=" + getNumber() + ", date=" + getDate() + ", totalAmount=" + getTotalAmount() + ", departmentCode="
                + getDepartmentCode() + "]";
    }
}
