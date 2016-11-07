package com.step.dfa;

import java.util.*;


public class TransitionFunction {
    private Map<State, List<Transition>> table = new HashMap<>();
//    private State state;

    public void addTransition(Transition transition) {
        State state = transition.getStateSource();
        List<Transition> transitions = table.get(state);
        if (transitions == null) transitions = new ArrayList<>();
        transitions.add(transition);
        table.put(state, transitions);
    }

    @Override
    public String toString() {
        return "TransitionFunction{" +
                "table=" + table +
                '}';
    }

    public State findCurrentState(State currentState, char alphabet) {
        State state = null;
        List<Transition> transitions = table.get(currentState);
        if (transitions == null)
            throw new RuntimeException("Transitions Not Defined for this State");
        for (Transition transition : transitions) {
            state = transition.nextState(alphabet);
            break;
        }
        return state;
    }

}
