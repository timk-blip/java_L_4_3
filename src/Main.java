import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        CreditPaymentService service = new CreditPaymentService();
        Scanner in = new Scanner(System.in);
        System.out.print ("Введите сумму кредита : \t");
        float credit = in.nextFloat();
        System.out.print ("Введите срок кредитования : \t");
        int mounths = in.nextInt();
        System.out.print ("Введите процентную ставку : \t");
        double percent = in.nextFloat();
        System.out.print (": \n" + service.calculate (credit, mounths, percent));
    }
}
// сложнАААА, без помощи не обошелся
