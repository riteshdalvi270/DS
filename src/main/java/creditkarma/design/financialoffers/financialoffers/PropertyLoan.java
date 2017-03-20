package creditkarma.design.financialoffers.financialoffers;

import creditkarma.design.financialoffers.financialoffers.object.CreditScoreRequired;
import creditkarma.design.financialoffers.financialoffers.object.Offers;

/**
 * Created by ritesh on 3/19/17.
 */
public class PropertyLoan implements Loans {

    final CreditScoreRequired scoreRequired = new CreditScoreRequired(900,1000);

    @Override
    public LoanType getType() {
        return LoanType.PROPERTY;
    }

    @Override
    public CreditScoreRequired getCreditScoreRequired() {
        return scoreRequired;
    }

    @Override
    public Offers getOffers() {
        return null;
    }

    @Override
    public boolean satisfies(int userCreditScore) {
        if(userCreditScore < scoreRequired.getMaxScoreRequired()  && userCreditScore > scoreRequired.getMiniumScoreRequired()) {

            return true;
        }

        return false;
    }
}
