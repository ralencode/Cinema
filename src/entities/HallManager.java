package entities;

import java.util.Date;

public class HallManager extends Entity<Integer> {
    private int employeeId;
    private int hallId;
    private Date day;

    public HallManager(int id, int employeeId, int hallId, Date day) {
        this.setPrimaryKey(id);
        this.setEmployeeId(employeeId);
        this.setHallId(hallId);
        this.setDay(day);
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getHallId() {
        return hallId;
    }

    public void setHallId(int hallId) {
        this.hallId = hallId;
    }

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }
}
