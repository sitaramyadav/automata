import java.util.HashSet;
import java.util.Set;


public class DFAMachine {
    private final Set<State> setOfStates;
    private final HashSet alphabetSet;
    private final TransitionFunction transitionFunction;
    private State currentState;
    private final Set<State> setOfFinalState;

    public DFAMachine(Set<State> setOfStates, HashSet alphabetSet, TransitionFunction transitionFunction, State initialState, Set<State> setOfFinalState) {

        this.setOfStates = setOfStates;
        this.alphabetSet = alphabetSet;
        this.transitionFunction = transitionFunction;
        this.currentState = initialState;
        this.setOfFinalState = setOfFinalState;
    }



    public boolean check(String str) throws IllegalCharException {
        for (int i = 0; i < str.length(); i++) {
            char alphabet = str.charAt(i);
            if (!alphabetSet.contains(alphabet)) {
                throw new IllegalCharException(alphabet);
            }
            currentState = this.transitionFunction.addTransition(currentState, alphabet);

        }
        return setOfFinalState.contains(currentState);
    }
}
