package entities;

public class Student {
    public String name;
    public double firstQuarterNote;
    public double secondQuarterNote;
    public double thirdQuarterNote;

    public double getFinalScore() {
        return firstQuarterNote + secondQuarterNote + thirdQuarterNote;
    }

    public String studentSituation() {
        if (getFinalScore() > 60) {
            return "PASS";
        }
        else {
            return "FAILED\n" +
                    String.format("MISSING %.2f POINTS", missingPoints());
        }
    }

    public double missingPoints() {
        return getFinalScore() - 60;
    }

    public String toString() {
        return String.format("\nFINAL GRADE = %s\n", getFinalScore()) +
                studentSituation();
    }
}
