public abstract class AbstractDollarBill {

    protected AbstractDollarBill nextDollarBill;

    public void setNextDollarBill(AbstractDollarBill abstractDollarBill) {
        this.nextDollarBill = abstractDollarBill;
    }

    abstract void makeChange(int value);
}
