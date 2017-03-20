package creditkarma.design.financialoffers;

import creditkarma.design.financialoffers.financialoffers.Loans;
import creditkarma.design.financialoffers.financialoffers.StudentLoan;
import creditkarma.design.financialoffers.financialoffers.object.Offers;

/**
 * Created by ritesh on 3/19/17.
 */
public class Application {

    public static void main(String args[]) {

        final User user = new User("Ritesh","Dalvi");
        user.setCreditScore(500);

        final Offers offers = user.applyForLoans(new StudentLoan());

        if(offers == null) {
            System.out.println("Cannot apply");
        }else {
            System.out.println(offers);
        }
    }
}
