package creditkarma.design.financialoffers.financialoffers;

import creditkarma.design.financialoffers.financialoffers.object.CreditScoreRequired;
import creditkarma.design.financialoffers.financialoffers.object.Offers;

/**
 * Created by ritesh on 3/19/17.
 */
public interface Loans {


    LoanType getType();

    CreditScoreRequired getCreditScoreRequired();

    Offers getOffers();

    boolean satisfies(int userCreditScore);
}
