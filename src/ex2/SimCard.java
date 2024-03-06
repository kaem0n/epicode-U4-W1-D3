package ex2;

import java.util.Arrays;

public class SimCard {
    // ATTRIBUTES
    private final String phoneNumber;
    private int availableCredit;
    private Call[] lastCalls;

    // CONSTRUCTORS
    public SimCard(String phoneNum) {
        this.phoneNumber = phoneNum;
        this.availableCredit = 0;
        this.lastCalls = new Call[5];
    }

    // METHODS
    public String getSimData() {
        return "{ Phone number: " + this.phoneNumber +
                ", Credit: " + this.availableCredit +
                ", Last calls: " + Arrays.toString(this.lastCalls) +
                "}";
    }

    public void setCallList(Call[] arr) {
        this.lastCalls = arr;
    }

    public void addCredit(int newCredit) {
        this.availableCredit += newCredit;
    }
}
