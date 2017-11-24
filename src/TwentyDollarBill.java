public class TwentyDollarBill extends AbstractDollarBill {

    @Override
    void makeChange(int value) {
        if (value >= 20) {
            int num = value / 20;
            int remainder = value % 20;
            System.out.println(num + " $20 bills");

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
