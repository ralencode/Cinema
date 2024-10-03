package entities;

import java.util.Date;

public class Session extends Entity<Integer> {
    private int movieId;
    private int hallId;
    private Date beginning;

    public Session(int id, int movieId, int hallId, Date beginning) {
        this.setPrimaryKey(id);
        this.setMovieId(movieId);
        this.setHallId(hallId);
        this.setBeginning(beginning);
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public int getHallId() {
        return hallId;
    }

    public void setHallId(int hallId) {
        this.hallId = hallId;
    }

    public Date getBeginning() {
        return beginning;
    }

    public void setBeginning(Date beginning) {
        this.beginning = beginning;
    }
}
