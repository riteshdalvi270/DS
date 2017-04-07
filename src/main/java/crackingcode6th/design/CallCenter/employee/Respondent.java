package crackingcode6th.design.CallCenter.employee;

import crackingcode6th.design.CallCenter.Call;

/**
 * Created by ritesh on 3/22/17.
 */
public class Respondent implements Employee {

    Call call;
    @Override
    public Position getRank() {
        return Position.RESPONDENT;
    }

    @Override
    public void attendCall(Call call) {
        this.call = call;

        System.out.println("Respondent attending the call"+call.getDetails());

        freeCall();
    }


    private void freeCall() {
        call = null;
    }
}
