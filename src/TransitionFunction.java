import java.util.*;


public class TransitionFunction {
    private Map<State, List> table = new HashMap<>();


    public void  addTransition(Transition transition) {
         State state = transition.getStateSource();
         List transitions = table.get(state);
        if (transitions == null) transitions = new ArrayList<>();
        transitions.add(transition);
        table.put(state, transitions);
    }

    public State addTransition(State currentState, char alphabet) {
        State state = null;
        List<Transition> transitions = table.get(currentState);
        if (transitions == null)
            throw new RuntimeException("Transitions Not Defined for this state");
        for (Transition transition : transitions) {
            state = transition.nextState(alphabet);
            break;
        }
        return state;
    }
}
