import java.util.Scanner;
import java.lang.Math;
public class CreditPaymentService {
    public double calculate (double credit, int mounths, double percent)
    {
        double amount = 0;
        double j = percent / 100 / 12;
        double coefficient = j * Math.pow ((1 + j), mounths) / (Math.pow ((1 + j), mounths) - 1);
        amount = coefficient * credit;
        // double monthlypayment = 0;

        return amount;
    }
}
