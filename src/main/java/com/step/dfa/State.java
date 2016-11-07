package com.step.dfa;

public class State {
    private String stateName;
    private Boolean initialState;
    private Boolean finalState;

    public State(String name) {
        this.stateName = name;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        State state1 = (State) o;

        return stateName.equals(state1.stateName);

    }

    @Override
    public String toString() {
        return "State{" +
                "stateName='" + stateName + '\'' +
                ", initialState=" + initialState +
                ", finalState=" + finalState +
                '}';
    }

    @Override
    public int hashCode() {
        return stateName.hashCode();
    }

}
