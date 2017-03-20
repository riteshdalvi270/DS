package creditkarma.design.financialoffers;

import creditkarma.design.financialoffers.financialoffers.Loans;
import creditkarma.design.financialoffers.financialoffers.object.Offers;

/**
 * Created by ritesh on 3/19/17.
 */
public class User {

    CalculateScore calculateScore = new CalculateScore();

    final String firstName;
    final String lastName;

    int creditScore = 0;

    public User(final String firstName, final String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setCreditScore(int amount) {

        this.creditScore = amount;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public Offers applyForLoans(final Loans loan) {

        return calculateScore.offers(this,loan);
    }
}
