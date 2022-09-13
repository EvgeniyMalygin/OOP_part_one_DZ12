public class Gryffindor extends Hogwarts {

    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String fullName, int witchcraftPower, int transgressDistance, int nobility, int honor, int bravery) {
        super(fullName, witchcraftPower, transgressDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return getFullName() +
                '{' +
                "nobility= " + nobility +
                ", honor = " + honor +
                ", bravery = " + bravery +
                ", WitchcraftPower = " + getWitchcraftPower() +
                ", TransgressDistance = " + getTransgressDistance() +
                '}';
    }

}
