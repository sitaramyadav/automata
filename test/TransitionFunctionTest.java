import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TransitionFunctionTest {
    @Test
    public void addTransition_should_add_transition() {
        State q1 = new State("q1");
        State q2 = new State("q2");
        char alphabet = '0';
        TransitionFunction transitionFunction = new TransitionFunction(q1,alphabet,q2);
        transitionFunction.addTransition();
        assertEquals(transitionFunction.addTransition(),q2);

    }

}
