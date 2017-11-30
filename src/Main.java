public class Main {


    private static AbstractDollarBill getChainOfDollarBills() {
        AbstractDollarBill oneHundredDollarBill = new OneHundredDollarBill();
        AbstractDollarBill twentyDollarBill = new TwentyDollarBill();
        AbstractDollarBill tenDollarBill = new TenDollarBill();

        oneHundredDollarBill.setNextDollarBill(twentyDollarBill);
        twentyDollarBill.setNextDollarBill(tenDollarBill);

        return oneHundredDollarBill;
    }

    public static void main(String[] args) {
        AbstractDollarBill dollarBillChain = getChainOfDollarBills();

        System.out.println("Disperse change for: $530");
        dollarBillChain.makeChange(530);
        System.out.println("Disperse change for: $90");
        dollarBillChain.makeChange(90);
        System.out.println("Disperse change for: $40");
        dollarBillChain.makeChange(40);

    }
}
