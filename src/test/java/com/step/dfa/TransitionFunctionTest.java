import com.step.dfa.State;
import com.step.dfa.Transition;
import com.step.dfa.TransitionFunction;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TransitionFunctionTest {
    @Test
    public void addTransition_should_add_transition() {
        State q1 = new State("q1");
        State q2 = new State("q2");
        char alphabet = '0';
        Transition transition = new Transition(q1,'0',q2);
        TransitionFunction transitionFunction = new TransitionFunction();
        transitionFunction.addTransition(transition);
        State nextState = transitionFunction.addTransition(q1,alphabet);
        assertEquals(nextState, q2);

    }

}
