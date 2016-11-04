import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DFAMachineTest{
    @Test
    public void DFAMachine_should_be_to_recognise__zero() throws IllegalCharException {
        State state1 = new State("q1");
        State state2 = new State("q2");
        state2.setFinalState(true);

        Set<State> setOfStates = new HashSet<>();
        setOfStates.add(state1);
        setOfStates.add(state2);

        Set<State> setOfFinalState = new HashSet<>();
        setOfFinalState.add(state2);

        HashSet alphabetSet = new HashSet<>();
        alphabetSet.add('1');
        alphabetSet.add('0');

        TransitionFunction transitionFunction = new TransitionFunction();
        transitionFunction.addTransition(new Transition(state1, '0', state2));
        transitionFunction.addTransition(new Transition(state1, '1', state1));
        transitionFunction.addTransition(new Transition(state2, '0', state1));
        transitionFunction.addTransition(new Transition(state2, '1', state2));

        DFAMachine machine = new DFAMachine(setOfStates,alphabetSet,transitionFunction,state1,setOfFinalState);
        assertTrue(machine.check("0"));

    }

    @Test
    public void DFAMachine_should_be_to_recognise__000() throws IllegalCharException {
        State state1 = new State("q1");
        State state2 = new State("q2");
        state2.setFinalState(true);

        Set<State> setOfStates = new HashSet<>();
        setOfStates.add(state1);
        setOfStates.add(state2);

        Set<State> setOfFinalState = new HashSet<>();
        setOfFinalState.add(state2);

        HashSet alphabetSet = new HashSet<>();
        alphabetSet.add('1');
        alphabetSet.add('0');

        TransitionFunction transitionFunction = new TransitionFunction();
        transitionFunction.addTransition(new Transition(state1, '0', state2));
        transitionFunction.addTransition(new Transition(state1, '1', state1));
        transitionFunction.addTransition(new Transition(state2, '0', state1));
        transitionFunction.addTransition(new Transition(state2, '1', state2));

        DFAMachine machine = new DFAMachine(setOfStates,alphabetSet,transitionFunction,state1,setOfFinalState);
        assertTrue(machine.check("000"));

    }

    @Test
    public void DFAMachine_should_be_to_recognise__00000() throws IllegalCharException {
        State state1 = new State("q1");
        State state2 = new State("q2");
        state2.setFinalState(true);

        Set<State> setOfStates = new HashSet<>();
        setOfStates.add(state1);
        setOfStates.add(state2);

        Set<State> setOfFinalState = new HashSet<>();
        setOfFinalState.add(state2);

        HashSet alphabetSet = new HashSet<>();
        alphabetSet.add('1');
        alphabetSet.add('0');

        TransitionFunction transitionFunction = new TransitionFunction();
        transitionFunction.addTransition(new Transition(state1, '0', state2));
        transitionFunction.addTransition(new Transition(state1, '1', state1));
        transitionFunction.addTransition(new Transition(state2, '0', state1));
        transitionFunction.addTransition(new Transition(state2, '1', state2));

        DFAMachine machine = new DFAMachine(setOfStates,alphabetSet,transitionFunction,state1,setOfFinalState);
        assertTrue(machine.check("00000"));

    }

}