package entities;

public class SessionManager extends Entity<Integer> {
    private int occupationId;
    private int sessionId;

    public SessionManager(int id, int occupationId, int sessionId) {
        this.setPrimaryKey(id);
        this.setOccupationId(occupationId);
        this.setSessionId(sessionId);
    }

    public int getOccupationId() {
        return occupationId;
    }

    public void setOccupationId(int occupationId) {
        this.occupationId = occupationId;
    }

    public int getSessionId() {
        return sessionId;
    }

    public void setSessionId(int sessionId) {
        this.sessionId = sessionId;
    }
}
