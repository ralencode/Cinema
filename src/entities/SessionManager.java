package entities;

public class SessionManager extends Entity<Integer> {
    private int employeeId;
    private int sessionId;

    public SessionManager(int id, int employeeId, int sessionId) {
        this.setPrimaryKey(id);
        this.setEmployeeId(employeeId);
        this.setSessionId(sessionId);
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getSessionId() {
        return sessionId;
    }

    public void setSessionId(int sessionId) {
        this.sessionId = sessionId;
    }
}
