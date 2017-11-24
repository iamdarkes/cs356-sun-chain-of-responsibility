public class TenDollarBill extends AbstractDollarBill {

    @Override
    void makeChange(int value) {
        if (value >= 10) {
            int num = value / 10;
            int remainder = value % 10;
            System.out.println(num + " $10 bills");

            if (remainder != 0) {
                if (this.nextDollarBill != null) {
                    this.nextDollarBill.makeChange(remainder);
                }
            }
        } else {
            if (nextDollarBill != null) {
                nextDollarBill.makeChange(value);
            }
        }
    }
}
