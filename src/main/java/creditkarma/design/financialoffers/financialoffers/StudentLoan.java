package creditkarma.design.financialoffers.financialoffers;

import creditkarma.design.financialoffers.financialoffers.object.CreditScoreRequired;
import creditkarma.design.financialoffers.financialoffers.object.Offers;

/**
 * Created by ritesh on 3/19/17.
 */
public class StudentLoan implements Loans {

    final CreditScoreRequired creditScoreRequired = new CreditScoreRequired(400,500);

    @Override
    public LoanType getType() {
        return LoanType.STUDENT;
    }

    @Override
    public CreditScoreRequired getCreditScoreRequired() {
        return creditScoreRequired;
    }

    @Override
    public Offers getOffers() {
        return null;
    }

    @Override
    public boolean satisfies(int userCreditScore) {
        if(userCreditScore < creditScoreRequired.getMaxScoreRequired()  && userCreditScore > creditScoreRequired.getMiniumScoreRequired()) {

            return true;
        }

        return false;
    }
}
