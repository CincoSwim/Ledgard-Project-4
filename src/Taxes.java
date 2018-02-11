import java.text.DecimalFormat;
import java.util.*;

public class Taxes {
    public static void main(String[] args){
        double netIncome;
        double taxPaid;
        String pattern;
        String taxPaidFormat;

        taxPaid = 0;
        pattern = "$###,##0.00";
        Scanner input = new Scanner(System.in);
        DecimalFormat moneyFormat = new DecimalFormat(pattern);

        System.out.print("Enter your net taxable income: $");
        netIncome = input.nextDouble();

        if (netIncome <= 9325)
            taxPaid = (0.10 * netIncome);

        else if (netIncome > 9325 && netIncome <= 37950)
            taxPaid = 932.5 + 0.15 * (netIncome - 9325);

        else if (netIncome > 37950 && netIncome <= 91900)
            taxPaid = 5226.25 + 0.25 * (netIncome - 37950);

        else if (netIncome > 91900 && netIncome <= 191650)
            taxPaid = 18713.75 + 0.28 * (netIncome - 91900);

        else if (netIncome > 191650 && netIncome <= 416700)
            taxPaid = 374963.75 + 0.33 * (netIncome - 191650);

        else if (netIncome > 416700 && netIncome <= 418400)
            taxPaid = 449230.25 + 0.35 * (netIncome - 416700);

        else if (netIncome > 418400)
            taxPaid = 449825.25 + 0.396 * (netIncome - 418400);

        taxPaidFormat = moneyFormat.format(taxPaid);
        System.out.println("Your 2018 tax is " + taxPaidFormat);
    }
}
