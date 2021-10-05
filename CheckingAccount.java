public class CheckingAccount extends Account {
    private double fees;
    public CheckingAccount (String name, String number, double bal, double fees) {
        super (name, number, bal);
        this.fees = fees;
    }
    public double getBal() {
        return super.getBal() - this.fees;
    }
}