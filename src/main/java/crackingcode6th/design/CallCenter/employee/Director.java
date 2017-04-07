package crackingcode6th.design.CallCenter.employee;

import crackingcode6th.design.CallCenter.Call;

/**
 * Created by ritesh on 3/22/17.
 */
public class Director implements Employee {

    Call call;

    @Override
    public Position getRank() {
        return Position.DIRECTOR;
    }

    @Override
    public void attendCall(Call call) {
        this.call = call;

        System.out.println("Director attending the call" + call.getDetails());

        freeCall();
    }


    private void freeCall() {
        call = null;
    }
}
