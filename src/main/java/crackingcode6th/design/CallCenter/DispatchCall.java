package crackingcode6th.design.CallCenter;

import crackingcode6th.design.CallCenter.employee.Director;
import crackingcode6th.design.CallCenter.employee.Employee;
import crackingcode6th.design.CallCenter.employee.Manager;
import crackingcode6th.design.CallCenter.employee.Respondent;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ritesh on 3/22/17.
 */
public class DispatchCall {

    List<List<Employee>> employees = new ArrayList<>();

    private final int MAX_RESPONDENTS = 10;
    private final int MAX_MANAGERS = 5;
    private final int MAX_DIRECTORS = 2;

    List<Call> callQueues = new ArrayList<>();

    public void dispatchCall(final Call call) {

        do {
            final Employee employee = getHandlerForTheCall();

            if (employee != null) {
                employee.attendCall(call);
                call.setEmployeeAttendingThisCall(employee);
            } else {
                callQueues.add(call);
            }

            if(!callQueues.isEmpty()) {
                final Employee freeEmployee = checkIfEmployeeIsFree();

                if(freeEmployee!=null) {

                    Call nextCall = callQueues.iterator().next();

                    freeEmployee.attendCall(nextCall);
                    nextCall.setEmployeeAttendingThisCall(freeEmployee);

                    callQueues.iterator().remove();
                }
            }

        }while(callQueues.isEmpty());
    }

    private Employee getHandlerForTheCall() {

        final List<Employee> respondents = employees.get(0);

        if(respondents.size() != MAX_RESPONDENTS) {

            final Respondent respondent = new Respondent();

            respondents.add(respondent);

            return respondent;
        }

        final List<Employee> managers = employees.get(1);

        if(managers.size() != MAX_MANAGERS) {

            final Manager manager = new Manager();

            managers.add(manager);

            return manager;
        }

        final List<Employee> directors = employees.get(2);

        if(directors.size() != MAX_DIRECTORS) {

            final Director director = new Director();

            directors.add(director);

            return director;
        }

        return null;
    }

    private Employee checkIfEmployeeIsFree() {
        return null;
    }
}
