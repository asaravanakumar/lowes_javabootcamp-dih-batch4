public class LoanAccount extends Account {

    private double loanAmount;
    private int tenure;
    private double roi;

    public LoanAccount() {
    }

    public LoanAccount(int id, String name, String type, double principal, int tenure, double roi) {
        super(id, name, type);
        this.loanAmount = principal;
        this.tenure = tenure;
        this.roi = roi;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
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
        System.out.println("Opening Loan Account");
    }

    @Override
    public void closeAccount() {
        System.out.println("Closing Loan Account");
    }

    @Override
    public void printAccountDetails() {
        System.out.println(this.getId() + " " + this.getName() + " " + this.getLoanAmount() + " " + this.getTenure() + " " + this.getRoi());

    }
}
