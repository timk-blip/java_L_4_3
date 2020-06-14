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
       /*-------------------------------------------------------------------------------------------*/
      /*  double percentmouth = 0; //bodyoftheloan  * percent / 365 * 30;
        //float bodyoftheloan;
        //float monthlypayment = credit / mounths;
        //System.out.print ("\nПервый месяц выплота составляет \t " + itog);
        // System.out.print ("\nОсновной долг в месяц \t " + monthlypayment);
        for (int i = mounths; i > 0; i --)
        {
            credit -= monthlypayment;
            percentmouth = credit * percent / 365 * 30;

            itog = monthlypayment +  percentmouth;
            System.out.print ("\nЕжемесячный платеж \t " + itog + "\t Процентная ставка \t" + percentmouth);
        }

        /*-------------------------------------------------------------------------------------------*/




    }
}
//https://myfin.by/wiki/term/differencirovannye-platezhi