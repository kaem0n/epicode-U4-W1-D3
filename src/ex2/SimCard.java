package ex2;

import java.util.Arrays;

public class SimCard {
    // ATTRIBUTES
    private final String phoneNumber;
    private final int availableCredit;
    private Call[] lastCalls;

    // CONSTRUCTORS
    public SimCard(String phoneNum, int credit) {
        this.phoneNumber = phoneNum;
        this.availableCredit = credit;
    }
    public SimCard(String phoneNum, int credit, Call[] callsArr) {
        this.phoneNumber = phoneNum;
        this.availableCredit = credit;
        this.lastCalls = callsArr;
    }

    // METHODS
    public String getSimData() {
        return "{ Phone number: " + this.phoneNumber +
                ", Credit: " + this.availableCredit +
                ", Last calls: " + Arrays.toString(this.lastCalls) +
                "}";
    }
}
