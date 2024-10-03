package entities;

public class Ticket extends Entity<Integer> {
    private String visitor;
    private int seatId;
    private int sessionId;

    public Ticket(int id, String visitor, int seatId, int sessionId) {
        this.setPrimaryKey(id);
        this.setVisitor(visitor);
        this.setSeatId(seatId);
        this.setSessionId(sessionId);
    }

    public String getVisitor() {
        return visitor;
    }

    public void setVisitor(String visitor) {
        this.visitor = visitor;
    }

    public int getSeatId() {
        return seatId;
    }

    public void setSeatId(int seatId) {
        this.seatId = seatId;
    }

    public int getSessionId() {
        return sessionId;
    }

    public void setSessionId(int sessionId) {
        this.sessionId = sessionId;
    }
}
