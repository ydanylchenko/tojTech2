package day10.returns;

public class Patient {
    private int ageAsInt;
    private double weightAsFloat;
    private boolean isAliveAsBoolean;
    private String nameAsString;

    public Patient(int ageAsInt, double weightAsFloat, boolean isAliveAsBoolean, String nameAsString) {
        this.ageAsInt = ageAsInt;
        this.weightAsFloat = weightAsFloat;
        this.isAliveAsBoolean = isAliveAsBoolean;
        this.nameAsString = nameAsString;
    }

    public String getNameAsString() {
        return nameAsString;
    }

    public void setNameAsString(String nameAsString) {
        this.nameAsString = nameAsString;
    }

    public boolean isAliveAsBoolean() {
        return isAliveAsBoolean;
    }

    public void setAliveAsBoolean(boolean aliveAsBoolean) {
        isAliveAsBoolean = aliveAsBoolean;
    }

    public double getWeightAsFloat() {
        return weightAsFloat;
    }

    public void setWeightAsFloat(float weightAsFloat) {
        this.weightAsFloat = weightAsFloat;
    }

    public int getAgeAsInt() {
        return ageAsInt;
    }

    public void setAgeAsInt(int ageAsInt) {
        this.ageAsInt = ageAsInt;
    }
}
