import java.util.Scanner;

public class CreditPaymentService {
    public float calculate (float credit, int mounths, float percent)
    {
        //float bodyoftheloan;
        float monthlypayment = credit / mounths;
        float percentmouth = 0; //bodyoftheloan  * percent / 365 * 30;
        float itog = 0; //monthlypayment +  percentmouth;
        //System.out.print ("\nПервый месяц выплота составляет \t " + itog);
        System.out.print ("\nОсновной долг в месяц \t " + monthlypayment);
        for (int i = mounths; i > 0; i --)
        {
            credit -= monthlypayment;
            percentmouth = credit  * percent / 365 * 30;

            itog = monthlypayment +  percentmouth;
            System.out.print ("\nЕжемесячный платеж \t " + itog + "\t Процентная ставка \t" + percentmouth);
        }

        return monthlypayment + percent;
    }
}
//https://myfin.by/wiki/term/differencirovannye-platezhi