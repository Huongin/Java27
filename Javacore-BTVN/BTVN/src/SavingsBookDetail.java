package src;

public class SavingsBookDetail {
    private Bank bank;
    private int savingsbookquantity;
    private float savingsdeposit;


    public SavingsBookDetail(Bank bank, int savingsbookquantity) {
        this.bank = bank;
        this.savingsbookquantity = savingsbookquantity;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public int getSavingsbookquantity() {
        return savingsbookquantity;
    }

    public void setSavingsbookquantity(int savingsbookquantity) {
        this.savingsbookquantity = savingsbookquantity;
    }

    public float getSavingsdeposit() {
        return savingsdeposit;
    }

    public void setSavingsdeposit(float savingsdeposit) {
        this.savingsdeposit = savingsdeposit;
    }

    @Override
    public String toString() {
        return "SavingsBookDetail{" +
                "bank=" + bank +
                ", savingsbookquantity=" + savingsbookquantity +
                ", savingsdeposit=" + savingsdeposit +
                '}';
    }
}
