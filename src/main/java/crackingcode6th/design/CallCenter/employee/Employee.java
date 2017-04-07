package crackingcode6th.design.CallCenter.employee;

import crackingcode6th.design.CallCenter.Call;

/**
 * Created by ritesh on 3/22/17.
 */
public interface Employee {

    Position getRank();

    void attendCall(final Call call);
}
