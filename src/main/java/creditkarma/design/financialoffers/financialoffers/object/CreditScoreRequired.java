package creditkarma.design.financialoffers.financialoffers.object;

/**
 * Created by ritesh on 3/19/17.
 */
public class CreditScoreRequired {

    int miniumScoreRequired;
    int maxScoreRequired;

    public int getMiniumScoreRequired() {
        return miniumScoreRequired;
    }

    public void setMiniumScoreRequired(int miniumScoreRequired) {
        this.miniumScoreRequired = miniumScoreRequired;
    }

    public int getMaxScoreRequired() {
        return maxScoreRequired;
    }

    public void setMaxScoreRequired(int maxScoreRequired) {
        this.maxScoreRequired = maxScoreRequired;
    }

    public CreditScoreRequired(int min,int max) {
        this.maxScoreRequired = min;
        this.maxScoreRequired = max;
    }
}
