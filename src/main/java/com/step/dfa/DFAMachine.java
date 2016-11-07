package com.step.dfa;


import com.step.exception.IllegalCharException;

import java.util.Set;


public class DFAMachine {
    private final Set<State> setOfStates;
    private final Set<String> alphabetSet;
    private final TransitionFunction transitionFunction;
    private State initialState;
    private final Set<State> setOfFinalState;

    public DFAMachine(Set<State> setOfStates, Set<String> alphabetSet, TransitionFunction transitionFunction, State initialState, Set<State> setOfFinalState) {

        this.setOfStates = setOfStates;
        this.alphabetSet = alphabetSet;
        this.transitionFunction = transitionFunction;
        this.initialState = initialState;
        this.setOfFinalState = setOfFinalState;

    }



    public boolean check(String alphabets) {
        State currentState = initialState;
        for (int i = 0; i < alphabets.length(); i++) {
            char alphabet = alphabets.charAt(i);
            try {
                authorize(alphabet);
            } catch (IllegalCharException e) {
                e.printStackTrace();
            }
            currentState = transitionFunction.findCurrentState(currentState, alphabet);

        }
        return setOfFinalState.contains(currentState);
    }

    private void authorize(Character alphabet) throws IllegalCharException {
        if (!alphabetSet.contains(alphabet)) {
            throw new IllegalCharException(alphabet);

        }
    }

}
