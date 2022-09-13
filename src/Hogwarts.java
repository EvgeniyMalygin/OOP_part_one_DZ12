public class Hogwarts {
    private String fullName;
    private int witchcraftPower;
    private int transgressDistance;


    public Hogwarts(String fullName, int witchcraftPower, int transgressDistance) {
        this.fullName = fullName;
        this.witchcraftPower = witchcraftPower;
        this.transgressDistance = transgressDistance;

    }

    public int getWitchcraftPower() {
        return witchcraftPower;
    }

    public void setWitchcraftPower(int witchcraftPower) {
        this.witchcraftPower = witchcraftPower;
    }

    public int getTransgressDistance() {
        return transgressDistance;
    }

    public void setTransgressDistance(int transgressDistance) {
        this.transgressDistance = transgressDistance;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

}
