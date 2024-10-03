package entities;

public class Seat extends Entity<Integer>{
    private int hallId;
    private int row;
    private int number;

    public Seat(int id, int hallId, int row, int number) {
        this.setPrimaryKey(id);
        this.setHallId(hallId);
        this.setRow(row);
        this.setNumber(number);
    }

    public int getHallId() {
        return hallId;
    }

    public void setHallId(int hallId) {
        this.hallId = hallId;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
