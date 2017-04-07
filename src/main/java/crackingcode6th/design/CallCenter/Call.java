package crackingcode6th.design.CallCenter;

import crackingcode6th.design.CallCenter.employee.Employee;

/**
 * Created by ritesh on 3/22/17.
 */
public class Call {

    Employee employeeAttendingThisCall;

    void setEmployeeAttendingThisCall(final Employee employeeAttendingThisCall) {
        this.employeeAttendingThisCall = employeeAttendingThisCall;
    }
    public String getDetails() {

        return "Issue with laptop";
    }
}
