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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DFAMachine that = (DFAMachine) o;

        if (setOfStates != null ? !setOfStates.equals(that.setOfStates) : that.setOfStates != null) return false;
        if (alphabetSet != null ? !alphabetSet.equals(that.alphabetSet) : that.alphabetSet != null) return false;
        if (transitionFunction != null ? !transitionFunction.equals(that.transitionFunction) : that.transitionFunction != null)
            return false;
        if (initialState != null ? !initialState.equals(that.initialState) : that.initialState != null) return false;
        return setOfFinalState != null ? setOfFinalState.equals(that.setOfFinalState) : that.setOfFinalState == null;

    }

    @Override
    public int hashCode() {
        int result = setOfStates != null ? setOfStates.hashCode() : 0;
        result = 31 * result + (alphabetSet != null ? alphabetSet.hashCode() : 0);
        result = 31 * result + (transitionFunction != null ? transitionFunction.hashCode() : 0);
        result = 31 * result + (initialState != null ? initialState.hashCode() : 0);
        result = 31 * result + (setOfFinalState != null ? setOfFinalState.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "DFAMachine{" +
                "setOfStates=" + setOfStates +
                ", alphabetSet=" + alphabetSet +
                ", transitionFunction=" + transitionFunction +
                ", initialState=" + initialState +
                ", setOfFinalState=" + setOfFinalState +
                '}';
    }
}
