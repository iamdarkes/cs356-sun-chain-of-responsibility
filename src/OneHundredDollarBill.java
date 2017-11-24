public class OneHundredDollarBill extends AbstractDollarBill {

    @Override
    void makeChange(int value) {
        if (value >= 100) {
            int num = value / 100;
            int remainder = value % 100;
            System.out.println(num + " $100 bills");

            if (remainder != 0) {
                if (this.nextDollarBill != null) {
                    this.nextDollarBill.makeChange(remainder);
                }
            }

        } else {
            if (this.nextDollarBill != null) {
                this.nextDollarBill.makeChange(value);
            }
        }
    }
}
