public class Puffenduy extends Hogwarts{
    private int hardWork;
    private int loyalty;
    private int honesty;

    public Puffenduy(String fullName, int witchcraftPower, int transgressDistance, int hardWork, int loyalty, int honesty) {
        super(fullName, witchcraftPower, transgressDistance);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardWork() {
        return hardWork;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return getFullName() +
                '{' +
                "hardWork = " + hardWork +
                ", loyalty = " + loyalty +
                ", honesty = " + honesty +
                ", WitchcraftPower = " + getWitchcraftPower() +
                ", TransgressDistance = " + getTransgressDistance() +
                '}';
    }
}
