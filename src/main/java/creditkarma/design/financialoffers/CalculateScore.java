package creditkarma.design.financialoffers;

import creditkarma.design.financialoffers.financialoffers.Loans;
import creditkarma.design.financialoffers.financialoffers.object.Offers;

/**
 * Created by ritesh on 3/19/17.
 */
public class CalculateScore {

    public Offers offers(final User user, final Loans loans) {

        int usersCreditScore = user.getCreditScore();

        if(loans.satisfies(usersCreditScore)) {

            return loans.getOffers();
        }

        return null;
    }

}
