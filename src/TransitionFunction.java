import java.util.*;


public class TransitionFunction {
    private Transition transition;
    private Map<State, List> table = new HashMap<>();

    public TransitionFunction(State src, char alphabet, State destination) {
        this.transition = new Transition(src,alphabet,destination);

    }

    public State  addTransition() {
         State state = this.transition.getStateSource();
         List transitions = table.get(state);
        if (transitions == null) transitions = new ArrayList<>();
        transitions.add(transition);
        table.put(state, transitions);
        return transition.getStateDestination();
    }
}
