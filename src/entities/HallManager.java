package entities;

import java.util.Date;

public class HallManager extends Entity<Integer> {
    private int occupationId;
    private int hallId;
    private Date day;

    public HallManager(int id, int occupationId, int hallId, Date day) {
        this.setPrimaryKey(id);
        this.setOccupationId(occupationId);
        this.setHallId(hallId);
        this.setDay(day);
    }

    public int getOccupationId() {
        return occupationId;
    }

    public void setOccupationId(int occupationId) {
        this.occupationId = occupationId;
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
