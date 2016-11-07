package com.step.dfa;
import com.step.exception.IllegalCharException;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DFAMachineTest {
    @Test
    public void DFAMachine_should_be_to_recognise_odd_number_of_zero() throws IllegalCharException {
        DFAMachine machine = getDfaMachine();
        assertTrue(machine.check("0"));
        assertTrue(machine.check("000"));
        assertTrue(machine.check("00000"));
        assertTrue(machine.check("10"));
        assertTrue(machine.check("101010"));
        assertTrue(machine.check("010101"));

    }


    @Test
    public void DFAMachine_should_not_recognise_if_alphabets_does_not_contain_odd_number_of_zero() throws Exception {
        DFAMachine machine = getDfaMachine();
        assertFalse(machine.check("00"));
        assertFalse(machine.check("0000"));
        assertFalse(machine.check("010"));
        assertFalse(machine.check("1001"));
        assertFalse(machine.check("1010"));
        assertFalse(machine.check("001100"));
    }

    private DFAMachine getDfaMachine() {
        State initialState = new State("q1");
        State finalState = new State("q2");

        Set<State> setOfStates = new HashSet<>();
        setOfStates.add(initialState);
        setOfStates.add(finalState);

        Set<State> setOfFinalState = new HashSet<>();
        setOfFinalState.add(finalState);

        HashSet alphabetSet = new HashSet<>();
        alphabetSet.add('1');
        alphabetSet.add('0');

        TransitionFunction transitionFunction = new TransitionFunction();
        transitionFunction.addTransition(new Transition(initialState, '0', finalState));
        transitionFunction.addTransition(new Transition(initialState, '1', initialState));
        transitionFunction.addTransition(new Transition(finalState, '0', initialState));
        transitionFunction.addTransition(new Transition(finalState, '1', finalState));

        return new DFAMachine(setOfStates, alphabetSet, transitionFunction, initialState, setOfFinalState);
    }

}