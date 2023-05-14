package teachmeskills.homework7.task3;

import java.util.Date;

public class EmployeeContract extends Document{
    private String employeeName;
    private String startDate;
    private String endDate;

    public EmployeeContract(int number, Date date, String employeeName, String startDate, String endDate) {
        super(number, date);
        this.employeeName = employeeName;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    @Override
    public String toString() {
        return "EmployeeContract [number=" + getNumber() + ", date=" + getDate() + ", endDate=" + getEndDate() + ", startDate=" + getStartDate()
                +  ", employeeName=" + getEmployeeName() + "]";
    }
}
