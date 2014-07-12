/**
 * 
 */
package de.urszeidler.shr5.gameplay.dice;

/**
 * @author urs
 */
public class Shr5OppsedTest {

    private final Shr5TestResult result1;
    private final Shr5TestResult result2;

    public Shr5OppsedTest(Shr5TestResult result1, Shr5TestResult result2) {
        super();
        this.result1 = result1;
        this.result2 = result2;
    }

    public int getSuccesses1() {
        return result1.getSuccess() - result2.getSuccess();
    }

    public int getSuccesses2() {
        return result2.getSuccess() - result1.getSuccess();
    }

    public Shr5TestResult getResult1() {
        return result1;
    }

    public Shr5TestResult getResult2() {
        return result2;
    }
}
