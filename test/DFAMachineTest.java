import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertTrue;

public class DFAMachineTest{
    @Test
    public void should_be_able_check_if_string_is_reconsise_by_machine() throws IllegalCharException {
        State state1 = new State("q1");
        state1.setFinalState(true);
        State state2 = new State("q2");
        State state3 = new State("q3");
        state2.setFinalState(true);

        Set<State> setOfStates = new HashSet<>();
        setOfStates.add(state1);
        setOfStates.add(state2);
        setOfStates.add(state3);

        Set<State> setOfFinalState = new HashSet<>();
        setOfFinalState.add(state1);
        setOfFinalState.add(state2);

        HashSet alphabetSet = new HashSet<>();
        alphabetSet.add('0');
        alphabetSet.add('0');
        alphabetSet.add('0');

        TransitionFunction transitionFunction = new TransitionFunction();
        transitionFunction.addTransition(new Transition(state1, '0', state2));
        transitionFunction.addTransition(new Transition(state1, '1', state1));
        transitionFunction.addTransition(new Transition(state2, '0', state2));
        transitionFunction.addTransition(new Transition(state2, '1', state1));

        DFAMachine machine = new DFAMachine(setOfStates,alphabetSet,transitionFunction,state1,setOfFinalState);

        assertTrue(machine.check("000"));
    }
}