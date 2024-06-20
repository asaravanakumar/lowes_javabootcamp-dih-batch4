public class DepositAccount extends Account{

    private double principal;
    private int tenure;
    private double roi;

    public DepositAccount() {
    }

    public DepositAccount(int id, String name, String type, double principal, int tenure, double roi) {
        super(id, name, type);
        this.principal = principal;
        this.tenure = tenure;
        this.roi = roi;
    }

    public double getPrincipal() {
        return principal;
    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public int getTenure() {
        return tenure;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }

    public double getRoi() {
        return roi;
    }

    public void setRoi(double roi) {
        this.roi = roi;
    }

    @Override
    public void openAccount() {
        System.out.println("Opening Deposit Account");
    }

    @Override
    public void closeAccount() {
        System.out.println("Closing Deposit Account");
    }

    @Override
    public void printAccountDetails() {
        System.out.println(this.getId() + " " + this.getName() + " " + this.getPrincipal() + " " + this.getTenure() + " " + this.getRoi());
    }
}
