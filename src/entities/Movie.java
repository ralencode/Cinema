package entities;

public class Movie extends Entity<Integer> {
    private String name;
    private String genre;
    private int duration; // in minutes
    private int year;

    public Movie(int id, String name, String genre, int duration, int year) {
        this.setPrimaryKey(id);
        this.setName(name);
        this.setGenre(genre);
        this.setDuration(duration);
        this.setYear(year);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
