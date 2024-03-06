package ex2;

public class Call {
    // ATTRIBUTES
    private final String numCalled;
    private final String callMins;

    // CONSTRUCTORS
    public Call (String phoneNum, String mins) {
        this.numCalled = phoneNum;
        this.callMins = mins;
    }

    @Override
    public String toString() {
        return "Call{" +
                "numCalled='" + numCalled + '\'' +
                ", callMins='" + callMins + '\'' +
                '}';
    }
}
