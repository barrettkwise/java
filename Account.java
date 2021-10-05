public class Account {
    private String name, number;
    private double bal;
    public Account (String name, String number, double bal) {    
        this.name = name;
        this.number = number;
        this.bal = bal;
    }
    public String getAccName() {
        return this.name;
    }
    public String getAccNum() {
        return this.number;
    }
    public double getBal() {
        return this.bal;
    }
}
    
