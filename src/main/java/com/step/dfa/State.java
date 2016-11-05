package com.step.dfa;

public class State {
    private String stateName;
    private Boolean initialState;
    private Boolean finalState;

    public State(String name) {
        this.stateName = name;
    }

    public String getName() {
        return stateName;
    }

    public Boolean isInitialState() {
        return (initialState == Boolean.TRUE);
    }

    public Boolean isFinalState() {
        return (finalState == Boolean.TRUE);
    }

    public void setInitialState(Boolean initialState) {
        this.initialState = initialState;
    }

    public void setFinalState(Boolean finalState) {
        this.finalState = finalState;
    }

}
